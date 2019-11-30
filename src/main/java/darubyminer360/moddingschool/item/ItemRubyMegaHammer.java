package DaRubyMiner360.moddingschool.item;

import net.minecraft.item.ItemAxe;

public class ItemRubyMegaHammer extends ItemAxe {

	private int weaponDamage;

	public ItemRubyMegaHammer(ToolMaterial material) {
		super(material);
		this.setFull3D();
		this.setMaxStackSize(1);
		this.weaponDamage = 14;
		this.isItemTool(true);
	}

	private void isItemTool(boolean b) {
		
	}

}
