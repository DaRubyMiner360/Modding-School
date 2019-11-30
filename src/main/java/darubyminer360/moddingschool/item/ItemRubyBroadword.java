package DaRubyMiner360.moddingschool.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class ItemRubyBroadword extends ItemSword {

	private int weaponDamage;

	public ItemRubyBroadword(ToolMaterial material) {
		super(material);
		this.setFull3D();
		this.setMaxStackSize(1);
		this.weaponDamage = (int) 8.5;
		this.isItemTool(true);
	}

	private void isItemTool(boolean b) {
		
	}

}
