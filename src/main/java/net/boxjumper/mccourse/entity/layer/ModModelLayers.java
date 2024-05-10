package net.boxjumper.mccourse.entity.layer;

import net.boxjumper.mccourse.MCCourseMod;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
    public static final EntityModelLayer PORCUPINE =
            new EntityModelLayer(new Identifier(MCCourseMod.MOD_ID,"porcupine"), "main");

    public static final EntityModelLayer MOSSYSKELETON =
            new EntityModelLayer(new Identifier(MCCourseMod.MOD_ID,"mossyskeleton"), "main");
}
