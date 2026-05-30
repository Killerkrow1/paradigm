package net.killerkrow.paradigm.util;

import dev.onyxstudios.cca.api.v3.entity.EntityComponentFactoryRegistry;
import dev.onyxstudios.cca.api.v3.entity.EntityComponentInitializer;
import dev.onyxstudios.cca.api.v3.entity.RespawnCopyStrategy;
import net.killerkrow.paradigm.ParadigmMod;
import net.minecraft.item.ItemStack;

public class ModComponents implements EntityComponentInitializer {

    public static void setVesselUuid(ItemStack stack, String uuid) {
        stack.getOrCreateNbt().putString("vessel_uuid", uuid);
    }

    public static String getVesselUuid(ItemStack stack) {
        return stack.getOrCreateNbt().getString("vessel_uuid");
    }

    public static void setPlayerNameForSoulOwning(ItemStack stack, String name) {
        stack.getOrCreateNbt().putString("player_name_for_soul_owning", name);
    }

    public static String getPlayerNameForSoulOwning(ItemStack stack) {
        return stack.getOrCreateNbt().getString("player_name_for_soul_owning");
    }

    public static int getContractSigned(ItemStack stack) {
        return stack.getOrCreateNbt().getInt("contract_signed");
    }

    public static void setContractSigned(ItemStack stack, int signed) {
        stack.getOrCreateNbt().putInt("contract_signed", signed);
    }

    public static void initialize() {
        ParadigmMod.LOGGER.info("Initializing Mod Components for " + ParadigmMod.MOD_ID);
    }

    @Override
    public void registerEntityComponentFactories(EntityComponentFactoryRegistry registry) {
        registry.registerForPlayers(
                HasOffhandComponent.KEY,
                HasOffhandComponentImpl::new,
                RespawnCopyStrategy.ALWAYS_COPY
        );
    }
}