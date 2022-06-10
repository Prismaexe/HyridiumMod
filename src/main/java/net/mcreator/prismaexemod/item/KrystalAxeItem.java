
package net.mcreator.prismaexemod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.prismaexemod.PrismaexemodModElements;

@PrismaexemodModElements.ModElement.Tag
public class KrystalAxeItem extends PrismaexemodModElements.ModElement {
	@ObjectHolder("prismaexemod:krystal_axe")
	public static final Item block = null;
	public KrystalAxeItem(PrismaexemodModElements instance) {
		super(instance, 80);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 4595;
			}

			public float getEfficiency() {
				return 21f;
			}

			public float getAttackDamage() {
				return 14f;
			}

			public int getHarvestLevel() {
				return 16;
			}

			public int getEnchantability() {
				return 112;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(KrystalIngotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("krystal_axe"));
	}
}
