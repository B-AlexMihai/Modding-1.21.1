package net.silly.tutorialmod.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.silly.tutorialmod.TutorialMod;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TutorialMod.MODID);

    public static final DeferredItem<Item> SILVER = ITEMS.register("silver",
            () -> new Item(new Item.Properties()));

    //JOKES
    public static final DeferredItem<Item> FRONTMAN = ITEMS.register("frontman",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FRONTMANBIG = ITEMS.register("frontmanbig",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
