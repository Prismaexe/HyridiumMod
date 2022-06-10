
package net.mcreator.prismaexemod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.prismaexemod.PrismaexemodModElements;

@PrismaexemodModElements.ModElement.Tag
public class MythrilShovelItem extends PrismaexemodModElements.ModElement {
	@ObjectHolder("prismaexemod:mythril_shovel")
	public static final Item block = null;
	public MythrilShovelItem(PrismaexemodModElements instance) {
		super(instance, 61);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(MythrilIngotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("mythril_shovel"));
	}
}
