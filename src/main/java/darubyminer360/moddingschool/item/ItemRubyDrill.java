package DaRubyMiner360.moddingschool.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class ItemRubyDrill extends ItemPickaxe {

	private int weaponDamage;

	public ItemRubyDrill(ToolMaterial material) {
		super(material);
		this.setFull3D();
		this.setMaxStackSize(1);
		this.weaponDamage = 15;
		this.isItemTool(true);
	}

	private void isItemTool(boolean b) {
		
	}

}
