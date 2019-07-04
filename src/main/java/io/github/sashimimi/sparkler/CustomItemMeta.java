package io.github.sashimimi.sparkler;

import java.util.ArrayList;
import java.util.List;
import org.bukkit.Color;
import org.bukkit.DyeColor;
import org.bukkit.FireworkEffect;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BannerMeta;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class CustomItemMeta 
{
	public static ItemStack americanBanner()
	{
		ItemStack item = new ItemStack(Material.RED_BANNER, 1);
		BannerMeta meta = (BannerMeta) item.getItemMeta();
		List<Pattern> patterns = new ArrayList<Pattern>();
		
		patterns.add(new Pattern(DyeColor.WHITE, PatternType.STRIPE_SMALL));
		patterns.add(new Pattern(DyeColor.BLUE, PatternType.SQUARE_TOP_LEFT));
		
		meta.setPatterns(patterns);
		item.setItemMeta(meta);
		
		return item;
	}
	
	public static ItemStack customLeatherArmor(Material material, Color color)
	{
		ItemStack item = new ItemStack(material, 1);
		LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
		
		meta.setColor(color);
		meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 3, false);
		
		item.setItemMeta(meta);
		
		return item;
	}
	
	public static ItemStack customFireworks(List<String> colors, FireworkEffect.Type type)
	{
		ItemStack item = new ItemStack(Material.FIREWORK_ROCKET, 64);
		FireworkMeta meta = (FireworkMeta) item.getItemMeta();
		FireworkEffect.Builder builder = FireworkEffect.builder();
		
		builder.withColor(colors).withTrail().with(type);
		meta.addEffect(builder.build());
		meta.setPower(2);
		
		item.setItemMeta(meta);
		
		return item;
	}
}
