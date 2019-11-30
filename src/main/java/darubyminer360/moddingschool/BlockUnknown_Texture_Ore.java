package DaRubyMiner360.moddingschool;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockUnknown_Texture_Ore extends Block {

	public BlockUnknown_Texture_Ore(Material material) {
		super(material);
		this.setHardness(3.0F);
		this.setHarvestLevel("pickaxe", 4);
		this.setLightLevel(1.0F);
	}
	
}
