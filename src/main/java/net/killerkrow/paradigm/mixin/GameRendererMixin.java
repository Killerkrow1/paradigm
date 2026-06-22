package net.killerkrow.paradigm.mixin;

import net.killerkrow.paradigm.effect.ModStatusEffects;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GameRenderer.class)
public abstract class GameRendererMixin {
    @Shadow public abstract void loadPostProcessor(Identifier id);

    private static final Identifier GRAYSCALE_SHADER_ID = new Identifier("minecraft", "shaders/post/desaturate.json");

    @Inject(method = "render", at = @At("HEAD"))
    private void applyShaderOnEffect(float tickDelta, long startTime, boolean tick, CallbackInfo ci) {
        MinecraftClient client = MinecraftClient.getInstance();

        if (client.player != null) {
            // Do you have my poitionous effects?
            boolean hasEffect = client.player.hasStatusEffect(ModStatusEffects.WATCHED);
            boolean hasShader = client.gameRenderer.getPostProcessor() != null;

            if (hasEffect && !hasShader) {
                // THIS WILL APPLY THE SHADER
                loadPostProcessor(GRAYSCALE_SHADER_ID);
            } else if (!hasEffect && hasShader) {
                // If they no no have it, they no no have shader, we don't give away our shaders for free
                client.gameRenderer.disablePostProcessor();
            }
        }
    }
}