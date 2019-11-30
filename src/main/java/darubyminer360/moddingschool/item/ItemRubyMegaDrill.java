package DaRubyMiner360.moddingschool.item;

import net.minecraft.item.ItemPickaxe;

public class ItemRubyMegaDrill extends ItemPickaxe {

	private int weaponDamage;

	public ItemRubyMegaDrill(ToolMaterial material) {
		super(material);
		this.setFull3D();
		this.setMaxStackSize(1);
		this.weaponDamage = 15;
		this.isItemTool(true);
	}

	private void isItemTool(boolean b) {
		
	}

}
