package net.killerkrow.paradigm.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.killerkrow.paradigm.ParadigmMod;
import net.killerkrow.paradigm.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup AFTERLIFE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ParadigmMod.MOD_ID, "smile_item"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.afterlife_tab"))
                    .icon(() -> new ItemStack(ModItems.SMILE_ITEM)).entries((displayContext, entries) -> {
                        entries.add(ModItems.SMILE_ITEM);


                        entries.add(ModItems.SMILEY_NOTES);


                        entries.add(ModItems.REVERENCE_BERRY);
                        entries.add(ModItems.GOLDEN_REVERENCE_BERRY);


                        entries.add(ModBlocks.REVERENCE_BERRY_SACK);
                        entries.add(ModBlocks.VOYD_DARK);

                    }).build());

    public static void registerItemGroups() {
        ParadigmMod.LOGGER.info("Registering Item Groups for " +ParadigmMod.MOD_ID);
    }
}
