package net.killerkrow.paradigm.item.weapons;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.killerkrow.paradigm.effect.ModStatusEffects;
import net.killerkrow.paradigm.util.ModRarities;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SkullScythe extends SwordItem implements Vanishable {
    private final float attackDamage;
    private final ModRarities rarity;

    public SkullScythe(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings, ModRarities rarity) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
        this.attackDamage = (float) attackDamage + toolMaterial.getAttackDamage();
        ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
        builder.put(EntityAttributes.GENERIC_ATTACK_DAMAGE, new EntityAttributeModifier(ATTACK_DAMAGE_MODIFIER_ID, "Weapon modifier", (double) this.attackDamage, EntityAttributeModifier.Operation.ADDITION));
        builder.put(EntityAttributes.GENERIC_ATTACK_SPEED, new EntityAttributeModifier(ATTACK_SPEED_MODIFIER_ID, "Weapon modifier", (double) attackSpeed, EntityAttributeModifier.Operation.ADDITION));
        Multimap<EntityAttribute, EntityAttributeModifier> attributeModifiers = builder.build();
        this.rarity = rarity;
    }

    @Override
    public Text getName(ItemStack stack) {
        Text baseName = super.getName(stack);

        return baseName.copy().setStyle(Style.EMPTY.withColor(rarity.color));
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public ActionResult useOnBlock(net.minecraft.item.ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos blockPos = context.getBlockPos();
        PlayerEntity player = context.getPlayer();

        // ARE YOU LOOKING AT THE TOP OF THE BLOCK????????????
        if (context.getSide() != Direction.DOWN && world.getBlockState(blockPos.up()).isAir()) {
            BlockState state = world.getBlockState(blockPos);

            // WHY IS THERE NOT A TAG FOR IF IT CAN TURN TO FARMLAND??????????
            if (state.isOf(Blocks.GRASS_BLOCK) || state.isOf(Blocks.DIRT_PATH) || state.isOf(Blocks.DIRT)) {
                if (world.isClient) {
                    return ActionResult.SUCCESS;
                }

                world.setBlockState(blockPos, Blocks.FARMLAND.getDefaultState());

                // Your gonna get the damaged tool regardless if it is a cool scythe or not, deal with me
                if (player != null) {
                    context.getStack().damage(1, player, p -> p.sendToolBreakStatus(context.getHand()));
                }

                // I got two phones, one for the ladies, and one for the [My Lawyer has Advised Me Not To Finish This Joke] /eggchan ref
                world.playSound(player, blockPos, SoundEvents.ITEM_HOE_TILL, SoundCategory.BLOCKS, 1.0F, 1.0F);
                return ActionResult.SUCCESS;
            }
        }
        return super.useOnBlock(context);
    }

    @Override
    public float getMiningSpeedMultiplier(net.minecraft.item.ItemStack stack, BlockState state) {
        // HERE IS WHERE A TAG IS MEANT TO BE MOJANG, WHERE IS THE TAG IF IT TURNS TO FARMLAND????
        if (state.isIn(BlockTags.HOE_MINEABLE)) {
            return 8.0F; // Mining speed go brrrrrrrrrrr
        }
        return super.getMiningSpeedMultiplier(stack, state);
    }

    @Override
    public boolean isSuitableFor(BlockState state) {
        // IS IT A HOE MINEABLE ITEM??????
        return state.isIn(BlockTags.HOE_MINEABLE) || super.isSuitableFor(state);
    }

    //This is for the item to remain in the crafting table
    @Override
    public ItemStack getRecipeRemainder(ItemStack stack) {
        return new ItemStack(this);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient() && entity instanceof PlayerEntity player) {

            // Are you holding it, I hope you are
            boolean isHolding = player.getStackInHand(Hand.MAIN_HAND).getItem() == this
                    || player.getStackInHand(Hand.OFF_HAND).getItem() == this;

            if (isHolding) {
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 40, 0, true, true));
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 40, 0, true, true));
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (!attacker.getWorld().isClient()) {
            if (attacker instanceof PlayerEntity player) {
            }

            if (target instanceof PlayerEntity victim) {
                victim.addStatusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 100, 0));
                victim.addStatusEffect(new StatusEffectInstance(ModStatusEffects.WATCHED, 100, 0));
            }
        }
        return super.postHit(stack, target, attacker);
    }

    // tooltip
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("tooltip.paradigm.skull_scythe.tooltip").formatted(Formatting.DARK_PURPLE));
        } else {
            tooltip.add(Text.literal("[SHIFT]").formatted(Formatting.DARK_GRAY));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }
}