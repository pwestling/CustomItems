package com.Otho.customItems.mod.items.food;

import com.Otho.customItems.mod.creativeTab.customItemsTab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.item.ItemSeeds;

public class CustomFood extends ItemFood{
	
	public CustomFood (int healAmount, float saturationModifier, boolean isWolfsFavoriteMeat){
		super(healAmount, saturationModifier, isWolfsFavoriteMeat);
		
		this.setCreativeTab(customItemsTab.customItemsTab);
        
	}
	
	@Override
    public String getUnlocalizedName() {
        return super.getUnlocalizedName();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
    }	

}
