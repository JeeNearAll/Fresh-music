package net.freshmusic.procedure;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.item.ItemStack;

import net.freshmusic.ElementsFreshmusic;

@ElementsFreshmusic.ModElement.Tag
public class ProcedureSamplekcreated extends ElementsFreshmusic.ModElement {
	public ProcedureSamplekcreated(ElementsFreshmusic instance) {
		super(instance, 3);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure Samplekcreated!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		{
			ItemStack _stack = (itemstack);
			if (!_stack.hasTagCompound())
				_stack.setTagCompound(new NBTTagCompound());
			_stack.getTagCompound().setDouble("musiclengh", 243);
		}
		{
			ItemStack _stack = (itemstack);
			if (!_stack.hasTagCompound())
				_stack.setTagCompound(new NBTTagCompound());
			_stack.getTagCompound().setString("musictype", "sampletrack");
		}
	}
}
