package DaRubyMiner360.moddingschool;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRuby_Block extends Block {

	public BlockRuby_Block(Material material) {
		super(material);
		this.setHardness(3.0F);
		this.setHarvestLevel("pickaxe", 4);
		this.setLightLevel(0.3F);
	}

}
