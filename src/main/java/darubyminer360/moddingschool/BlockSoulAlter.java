package DaRubyMiner360.moddingschool;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockSoulAlter extends Block {
	
	public IIcon[] textures = new IIcon[6];

	public BlockSoulAlter(Material material) {
		super(material);
		this.setHardness(1.0F);
		this.setResistance(2000.0F);
		this.setLightLevel(1.0F);
	}
	
	@Override
	public boolean isOpaqueCube() {
		return false;
	}
	
	public void registerBlockIcons(IIconRegister reg){
		
		for (int count = 0; count < 6; count++){
			
			this.textures[count] = reg.registerIcon(this.textureName+"_"+count);
			
		}		
	}
	
	
	public IIcon getIcon(int side, int meta){
		return this.textures[side];
	}
	
}
