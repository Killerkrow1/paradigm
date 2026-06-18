package net.killerkrow.paradigm.util.particles;

import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import team.lodestar.lodestone.registry.common.particle.LodestoneScreenParticleRegistry;
import team.lodestar.lodestone.systems.easing.Easing;
import team.lodestar.lodestone.systems.particle.builder.ScreenParticleBuilder;
import team.lodestar.lodestone.systems.particle.data.GenericParticleData;
import team.lodestar.lodestone.systems.particle.data.color.ColorParticleData;
import team.lodestar.lodestone.systems.particle.data.spin.SpinParticleData;
import team.lodestar.lodestone.systems.particle.render_types.LodestoneScreenParticleRenderType;
import team.lodestar.lodestone.systems.particle.screen.ScreenParticleHolder;

import java.awt.*;

import static net.minecraft.util.math.MathHelper.nextFloat;

public class ScreenParticleEffects {

    public static void spawnInvertedParticles(ScreenParticleHolder target, World world, float intensity, float partialTick) {
        float timeMultiplier = MathHelper.nextFloat(world.getRandom(), 0.9f, 1.4f);
        Color color = new Color(11, 255, 243);
        Color endColor = new Color(57, 207, 198);
        float gameTime = world.getTime() + partialTick;
        var rand = MinecraftClient.getInstance().world.getRandom();
        SpinParticleData spinParticleData = SpinParticleData.createRandomDirection(rand, 0, world.getRandom().nextBoolean() ? 1 : -2).setSpinOffset(0.025f * gameTime % 6.28f).setEasing(Easing.EXPO_IN_OUT).build();
        ScreenParticleBuilder.create(LodestoneScreenParticleRegistry.STAR, target)
                .setScaleData(GenericParticleData.create(1.2f * intensity + rand.nextFloat() * 0.1f * intensity, 0).setEasing(Easing.SINE_IN_OUT, Easing.BOUNCE_IN_OUT).build())
                .setTransparencyData(GenericParticleData.create(0.05f, 0.1f, 0f).setEasing(Easing.SINE_IN_OUT).build())
                .setColorData(ColorParticleData.create(color, endColor).setCoefficient(2f).build())
                .setSpinData(spinParticleData)
                .setLifetime((int) ((10 + rand.nextInt(10)) * timeMultiplier))
                .setRandomOffset(0.05f)
                .setRandomMotion(0.05f, 0.05f)
                .setRenderType(LodestoneScreenParticleRenderType.ADDITIVE)
                .spawnOnStack(2.5, -2.5);
        ScreenParticleBuilder.create(LodestoneScreenParticleRegistry.TWINKLE, target)
                .setScaleData(GenericParticleData.create(0.8f * intensity + rand.nextFloat() * 0.6f * intensity, 0).setEasing(Easing.EXPO_OUT).build())
                .setTransparencyData(GenericParticleData.create(0.05f, 0.1f, 0f).setEasing(Easing.SINE_IN_OUT).build())
                .setColorData(ColorParticleData.create(color, endColor).setCoefficient(1.25f).build())
                .setSpinData(spinParticleData)
                .setLifetime(20 + rand.nextInt(8))
                .setRandomOffset(0.1f)
                .setRandomMotion(0.4f, 0.4f)
                .setRenderType(LodestoneScreenParticleRenderType.ADDITIVE)
                .spawnOnStack(2.5, -2.5)
                .setLifetime((int) ((10 + rand.nextInt(2)) * timeMultiplier))
                .setSpinData(SpinParticleData.create(nextFloat(rand, 0.05f, 0.1f)).build())
                .setScaleData(GenericParticleData.create(0.8f + rand.nextFloat() * 0.4f, 0f).build())
                .setRandomMotion(0.01f, 0.01f)
                .spawnOnStack(2.5, -2.5);
    }
}