package com.forge.sample.moditem;

import com.forge.sample.Mod_for_Practice;
import com.forge.sample.Reference;
import net.minecraft.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Moditems {
    public static final DeferredRegister<Item> Item=
            DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MODID);

}
