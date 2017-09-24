package cazador.furnaceoverhaul.tile;

import javax.annotation.Nullable;

import cazador.furnaceoverhaul.handler.EnumHandler.KitTypes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;

public class TileEntityDiamondFurnace extends TileEntityIronFurnace {
	
	public TileEntityDiamondFurnace(){
	     super(KitTypes.DIAMOND);
	}
    
	@Override
    public int getCookTime(ItemStack stack){
    	if(types == KitTypes.DIAMOND){
    		return this.types.getMeta() + 88;
    	}
        return 90;
    }

    @Override
    public String getGuiID() {
    	return "furnaceoverhaul:diamondfurnace";
    }
}