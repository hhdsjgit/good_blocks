package net.mcreator.goodblock.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.goodblock.init.GoodblockModMobEffects;

public class ImpureuraniumDangWuPinZaiShouShangMeiKeFaShengProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(GoodblockModMobEffects.RADIATION.get(), 5, 1));
	}
}
