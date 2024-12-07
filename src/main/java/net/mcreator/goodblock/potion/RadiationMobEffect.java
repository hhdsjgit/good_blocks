
package net.mcreator.goodblock.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.goodblock.procedures.RadiationZaiXiaoGuoChiXuShiMeiKeFaShengProcedure;

public class RadiationMobEffect extends MobEffect {
	public RadiationMobEffect() {
		super(MobEffectCategory.HARMFUL, -256);
	}

	@Override
	public String getDescriptionId() {
		return "effect.goodblock.radiation";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		RadiationZaiXiaoGuoChiXuShiMeiKeFaShengProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
