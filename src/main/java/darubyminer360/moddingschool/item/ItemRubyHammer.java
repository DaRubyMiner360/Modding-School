package DaRubyMiner360.moddingschool.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class ItemRubyHammer extends ItemPickaxe {

	private int weaponDamage;

	public ItemRubyHammer(ToolMaterial material) {
		super(material);
		this.setFull3D();
		this.setMaxStackSize(1);
		this.weaponDamage = 8;
		this.isItemTool(true);
	}

	private void isItemTool(boolean b) {
		
	}

}
