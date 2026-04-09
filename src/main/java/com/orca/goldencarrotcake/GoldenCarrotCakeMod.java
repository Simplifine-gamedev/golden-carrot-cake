package com.orca.goldencarrotcake;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GoldenCarrotCakeMod implements ModInitializer {
    public static final String MOD_ID = "goldencarrotcake";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    // Food component: 8 hunger, regeneration I for 10 seconds (200 ticks)
    public static final FoodComponent GOLDEN_CARROT_CAKE_FOOD = new FoodComponent.Builder()
            .nutrition(8)
            .saturationModifier(0.8f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 0), 1.0f)
            .build();

    // Item will be registered in onInitialize
    public static Item GOLDEN_CARROT_CAKE;

    @Override
    public void onInitialize() {
        try {
            // Create identifier
            Identifier itemId = Identifier.of(MOD_ID, "golden_carrot_cake");
            LOGGER.info("Creating item with ID: " + itemId);

            // Create the item
            GOLDEN_CARROT_CAKE = new Item(new Item.Settings()
                    .food(GOLDEN_CARROT_CAKE_FOOD)
                    .maxCount(64));

            // Register the item
            Item registered = Registry.register(Registries.ITEM, itemId, GOLDEN_CARROT_CAKE);
            LOGGER.info("Registered item successfully: " + registered);

            // Add to food creative tab
            ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(content -> {
                content.add(GOLDEN_CARROT_CAKE);
            });

            LOGGER.info("Golden Carrot Cake mod initialized!");
        } catch (Exception e) {
            LOGGER.error("Failed to initialize Golden Carrot Cake mod!", e);
        }
    }
}
