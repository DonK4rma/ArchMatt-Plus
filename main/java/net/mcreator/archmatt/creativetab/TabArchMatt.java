
package net.mcreator.archmatt.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.archmatt.item.ItemArchMattIcon;
import net.mcreator.archmatt.ElementsArchMatt;

@ElementsArchMatt.ModElement.Tag
public class TabArchMatt extends ElementsArchMatt.ModElement {
	public TabArchMatt(ElementsArchMatt instance) {
		super(instance, 71);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabarchmatt") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemArchMattIcon.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
