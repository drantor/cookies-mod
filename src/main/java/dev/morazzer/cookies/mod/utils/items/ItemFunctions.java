package dev.morazzer.cookies.mod.utils.items;

import dev.morazzer.cookies.mod.generated.utils.ItemAccessor;
import net.minecraft.item.ItemStack;

/**
 * Helper to make accessing data of Items easier.
 */
@FunctionalInterface
public interface ItemFunctions extends ItemAccessor {

    /**
     * Gets the item all other methods are related to.
     *
     * @return The item stack.
     */
    ItemStack getItemStack();

}
