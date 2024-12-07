
package net.mcreator.goodblock.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.goodblock.init.GoodblockModTabs;
import net.mcreator.goodblock.init.GoodblockModFluids;

public class TESTGBKItem extends BucketItem {
	public TESTGBKItem() {
		super(GoodblockModFluids.TESTGBK, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(GoodblockModTabs.TAB_WORLDBLOCK));
	}
}
