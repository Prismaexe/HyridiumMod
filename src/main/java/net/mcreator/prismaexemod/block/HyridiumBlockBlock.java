
package net.mcreator.prismaexemod.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.prismaexemod.itemgroup.HyridiumModItemGroup;
import net.mcreator.prismaexemod.PrismaexemodModElements;

import java.util.List;
import java.util.Collections;

@PrismaexemodModElements.ModElement.Tag
public class HyridiumBlockBlock extends PrismaexemodModElements.ModElement {
	@ObjectHolder("prismaexemod:hyridium_block")
	public static final Block block = null;
	public HyridiumBlockBlock(PrismaexemodModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(HyridiumModItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(5f, 10f).setLightLevel(s -> 0).harvestLevel(6)
					.harvestTool(ToolType.PICKAXE).setRequiresTool());
			setRegistryName("hyridium_block");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
