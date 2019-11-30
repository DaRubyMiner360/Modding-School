package DaRubyMiner360.moddingschool;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockError404Block extends Block {

	public BlockError404Block(Material material) {
		super(material);
		this.setHardness(7.0F);
		this.setHarvestLevel("pickaxe", 6);
		this.setLightLevel(1.0F);
	}
	
}
