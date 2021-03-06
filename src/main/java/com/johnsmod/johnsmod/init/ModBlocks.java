package com.johnsmod.johnsmod.init;

import com.johnsmod.johnsmod.JohnsMod;
import net.minecraft.block.Block;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.FlowerPotBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.potion.Effects;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

/**
 * This class has the register event handler for all custom blocks. This class uses @Mod.EventBusSubscriber so the event handler has to be static This class uses @ObjectHolder to get a reference to the blocks
 */
@Mod.EventBusSubscriber(modid = JohnsMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(JohnsMod.MOD_ID)
public class ModBlocks {

    public static final Block secret_block = null;
    public static final Block sooper_secret_block = null;
    public static final FlowerBlock purple_tulip = null;
    public static final FlowerPotBlock potted_purple_tulip = null;

    /**
     * The actual event handler that registers the custom blocks.
     *
     * @param event The event this event handler handles
     */
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        //In here you pass in all block instances you want to register.
        //Make sure you always set the registry name.
        event.getRegistry().registerAll(

                new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(1).harvestLevel(0)).setRegistryName(JohnsMod.MOD_ID, "secret_block"),
                new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(1).harvestLevel(0)).setRegistryName(JohnsMod.MOD_ID, "sooper_secret_block"),
                new FlowerBlock(Effects.NAUSEA, 10, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT)).setRegistryName(JohnsMod.MOD_ID, "purple_tulip"),
                new FlowerPotBlock(purple_tulip, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0)).setRegistryName(JohnsMod.MOD_ID, "potted_purple_tulip")

        );
    }

}