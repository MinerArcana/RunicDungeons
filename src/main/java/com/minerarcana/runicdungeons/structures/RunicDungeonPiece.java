package com.minerarcana.runicdungeons.structures;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Mirror;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.feature.structure.TemplateStructurePiece;
import net.minecraft.world.gen.feature.template.BlockIgnoreStructureProcessor;
import net.minecraft.world.gen.feature.template.PlacementSettings;
import net.minecraft.world.gen.feature.template.Template;
import net.minecraft.world.gen.feature.template.TemplateManager;

import java.util.Random;

import static com.minerarcana.runicdungeons.RunicDungeons.MOD_ID;
import static com.minerarcana.runicdungeons.content.StructureRegistry.RUNIC_DUNGEON_PIECE;

public class RunicDungeonPiece extends TemplateStructurePiece {

    private final String templateName;
    private final RunicDungeonVariant variant;
    private final Rotation rotation;
    private final Mirror mirror;

    public RunicDungeonPiece(TemplateManager templateManager, RunicDungeonVariant variant, String templateName, BlockPos templatePosition, Rotation rotation) {
        this(templateManager, variant, templateName, templatePosition, rotation, Mirror.NONE);
    }

    public RunicDungeonPiece(TemplateManager templateManager, RunicDungeonVariant variant, String templateName, BlockPos templatePosition, Rotation rotation, Mirror mirror) {
        super(RUNIC_DUNGEON_PIECE, 0);
        this.templateName = templateName;
        this.variant = variant;
        this.templatePosition = templatePosition;
        this.rotation = rotation;
        this.mirror = mirror;
        this.loadTemplate(templateManager);
    }

    public RunicDungeonPiece(TemplateManager templateManager, CompoundNBT nbt) {
        super(RUNIC_DUNGEON_PIECE, nbt);
        this.templateName = nbt.getString("Template");
        this.variant = RunicDungeonVariant.getVariantFromIndex(nbt.getInt("Variant"));
        this.rotation = Rotation.valueOf(nbt.getString("Rotation"));
        this.mirror = Mirror.valueOf(nbt.getString("Mirror"));
        this.loadTemplate(templateManager);
    }

    private void loadTemplate(TemplateManager templateManager) {
        Template template = templateManager.getTemplateDefaulted(new ResourceLocation(MOD_ID + ":" + this.templateName));
        PlacementSettings placementsettings = (new PlacementSettings()).setIgnoreEntities(true).setRotation(this.rotation).setMirror(this.mirror).addProcessor(BlockIgnoreStructureProcessor.STRUCTURE_BLOCK);
        this.setup(template, this.templatePosition, placementsettings);
    }

    @Override
    protected void readAdditional(CompoundNBT tagCompound) {
        super.readAdditional(tagCompound);
        tagCompound.putString("Template", this.templateName);
        tagCompound.putInt("Variant", this.variant.getIndex());
        tagCompound.putString("Rotation", this.placeSettings.getRotation().name());
        tagCompound.putString("Mirror", this.placeSettings.getMirror().name());
    }

    @Override
    protected void handleDataMarker(String function, BlockPos blockPos, IWorld iWorld, Random random, MutableBoundingBox mutableBoundingBox) {
        switch (function) {

            case MOD_ID + ":wallblock":
                break;
            case MOD_ID + ":ceilingblock":
                break;
            case MOD_ID + ":floorblock":
                break;
            case MOD_ID + ":pillarblock":
                break;
            case MOD_ID + ":roomchest":
                break;
            case MOD_ID + ":centerchest":
                break;
            case MOD_ID + ":basicspawner":
                break;
            case MOD_ID + ":trapblock":
                break;
            case MOD_ID + ":lockblock":
                break;
            case MOD_ID + ":lightblock":
                break;
            case MOD_ID + ":pressureplate":
                break;
            case MOD_ID + ":fluid":
                break;
        }
    }

}
