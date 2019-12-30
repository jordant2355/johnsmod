package com.johnsmod.johnsmod.init;

import com.johnsmod.johnsmod.init.ModBlocks;
import com.johnsmod.johnsmod.JohnsMod;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;


/**
 * This class has the register event handler for all custom items.
 * This class uses @Mod.EventBusSubscriber so the event handler has to be static
 * This class uses @ObjectHolder to get a reference to the items
 */
@Mod.EventBusSubscriber(modid = JohnsMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(JohnsMod.MOD_ID)
public class ModItems {

    public static final Item orange_essence = null;
    public static final Item purple_essence = null;

    /**
     * The actual event handler that registers the custom items.
     *
     * @param event The event this event handler handles
     */
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        //In here you pass in all item instances you want to register.
        //Make sure you always set the registry name.
        event.getRegistry().registerAll(

                new Item(new Item.Properties()).setRegistryName(JohnsMod.MOD_ID, "orange_essence"),
                new Item(new Item.Properties()).setRegistryName(JohnsMod.MOD_ID, "purple_essence"),
                new BlockItem(ModBlocks.secret_block, new Item.Properties()).setRegistryName(ModBlocks.secret_block.getRegistryName()),
                new BlockItem(ModBlocks.sooper_secret_block, new Item.Properties()).setRegistryName(ModBlocks.sooper_secret_block.getRegistryName()),
                new BlockItem(ModBlocks.purple_tulip, new Item.Properties()).setRegistryName(ModBlocks.purple_tulip.getRegistryName())

                );
    }

}


