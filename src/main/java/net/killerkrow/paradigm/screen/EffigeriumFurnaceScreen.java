package net.killerkrow.paradigm.screen;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.ingame.AbstractFurnaceScreen;
import net.minecraft.client.gui.screen.recipebook.FurnaceRecipeBookScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class EffigeriumFurnaceScreen extends AbstractFurnaceScreen<EffigeriumFurnaceScreenHandler> {
    private static final Identifier BACKGROUND = new Identifier("textures/gui/container/furnace.png");

    public EffigeriumFurnaceScreen(EffigeriumFurnaceScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, new FurnaceRecipeBookScreen(), inventory, title, BACKGROUND);
    }

}