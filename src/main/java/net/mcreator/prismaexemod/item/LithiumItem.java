
package net.mcreator.prismaexemod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.prismaexemod.itemgroup.HyridiumModItemGroup;
import net.mcreator.prismaexemod.PrismaexemodModElements;

@PrismaexemodModElements.ModElement.Tag
public class LithiumItem extends PrismaexemodModElements.ModElement {
	@ObjectHolder("prismaexemod:lithium")
	public static final Item block = null;
	public LithiumItem(PrismaexemodModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(HyridiumModItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("lithium");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
