package DaRubyMiner360.moddingschool.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;

public class ItemRubySpear extends ItemBow {

	private int weaponDamage;

	public ItemRubySpear(ToolMaterial material) {
		this.setFull3D();
		this.setMaxStackSize(1);
		this.weaponDamage = 6;
		this.isItemTool(true);
	}

	private void isItemTool(boolean b) {
		
	}

}
