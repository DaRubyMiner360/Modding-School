package DaRubyMiner360.moddingschool;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockCheeseOre extends Block {

	public BlockCheeseOre(Material material) {
		super(material);
		this.setHardness(0.5F);
		this.setLightLevel(0.2F);
		this.setStepSound(this.soundTypeSnow);
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}
	
	@Override
	public Item getItemDropped(int metadata, Random rand, int fortune){
		return ModdingSchool.itemCheese;
	}
}
