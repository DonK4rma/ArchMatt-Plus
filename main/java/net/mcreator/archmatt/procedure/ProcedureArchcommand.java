package net.mcreator.archmatt.procedure;

import net.minecraftforge.fml.common.FMLCommonHandler;

import net.minecraft.util.text.TextComponentString;
import net.minecraft.server.MinecraftServer;

import net.mcreator.archmatt.ElementsArchMatt;

@ElementsArchMatt.ModElement.Tag
public class ProcedureArchcommand extends ElementsArchMatt.ModElement {
	public ProcedureArchcommand(ElementsArchMatt instance) {
		super(instance, 73);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		{
			MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
			if (mcserv != null)
				mcserv.getPlayerList().sendMessage(new TextComponentString("ArchMatt Version 1.0 BETA"));
		}
	}
}
