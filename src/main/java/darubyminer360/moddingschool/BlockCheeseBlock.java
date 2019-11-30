package DaRubyMiner360.moddingschool;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockCheeseBlock extends Block {

	public BlockCheeseBlock(Material material) {
		super(material);
		this.setHardness(0.5F);
		this.setLightLevel(0.2F);
		this.setStepSound(this.soundTypeSnow);
	}
	
}
