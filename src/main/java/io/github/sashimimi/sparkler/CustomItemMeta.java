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

/**
 * Creates various custom items relating to US Independence Day,
 * ranging from armor, banners, and fireworks.
 * 
 * @author sashimimi
 * @version 1.0.0
 * @since 1.0.0
 * @since October 22, 2019
 *
 */

public class CustomItemMeta 
{
	/**
	 * Creates an American banner custom item.
	 * 
	 * @since 1.0.0
	 * @return the created banner
	 */
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
	
	/**
	 * Creates a single piece of custom armor.
	 * 
	 * @param material 	the leather armor type to dye
	 * @param color 	the color the armor should be
	 * @return 			the created armor
	 */
	public static ItemStack customLeatherArmor(Material material, Color color)
	{
		ItemStack item = new ItemStack(material, 1);
		LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
		
		meta.setColor(color);
		meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 3, false);
		
		item.setItemMeta(meta);
		
		return item;
	}
	
	/**
	 * Creates 64 custom fireworks.
	 * 
	 * @param colors 	the colors of the firework
	 * @param type 		the type of firework
	 * @return 
	 */
	public static ItemStack customFireworks(List<Color> colors, FireworkEffect.Type type)
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
