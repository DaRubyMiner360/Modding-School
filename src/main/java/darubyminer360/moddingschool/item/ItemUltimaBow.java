package DaRubyMiner360.moddingschool.item;

import net.minecraft.item.ItemBow;

public class ItemUltimaBow extends ItemBow {

	private int weaponDamage;

	public ItemUltimaBow(ToolMaterial material) {
		this.setFull3D();
		this.setMaxStackSize(1);
		this.weaponDamage = 15;
		this.isItemTool(true);
	}

	private void isItemTool(boolean b) {
		
	}

}
