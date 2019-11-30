package DaRubyMiner360.moddingschool.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;

public class ItemRubyAxe extends ItemAxe {

	private int weaponDamage;

	public ItemRubyAxe(ToolMaterial material) {
		super(material);
		this.setFull3D();
		this.setMaxStackSize(1);
		this.weaponDamage = 5;
		this.isItemTool(true);
	}

	private void isItemTool(boolean b) {
		
	}

}
