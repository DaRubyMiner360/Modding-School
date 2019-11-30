package DaRubyMiner360.moddingschool;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockRuby_Ore extends Block {

	public BlockRuby_Ore(Material material) {
		super(material);
		this.setHardness(3.0F);
		this.setHarvestLevel("pickaxe", 4);
		this.setLightLevel(0.3F);
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}
	
	@Override
	public Item getItemDropped(int metadata, Random rand, int fortune){
		return ModdingSchool.itemRuby;
	}
}
