package com.Otho.customItems.mod.items;

import com.Otho.customItems.mod.blocks.CustomFluidBlock;
import com.Otho.customItems.mod.creativeTab.customItemsTab;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemBucket;

public class CustomBucket extends ItemBucket {
    public CustomBucket(CustomFluidBlock fluid) {
        super(fluid);
        this.setCreativeTab(customItemsTab.customItemsTab);
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }
}
