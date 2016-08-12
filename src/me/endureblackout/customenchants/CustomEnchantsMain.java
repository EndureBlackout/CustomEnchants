package me.endureblackout.customenchants;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Sign;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class CustomEnchantsMain extends JavaPlugin implements Listener {
	
	public void onEnable() {
		getLogger().info("Custom Enchants enabled!");
		File file = new File(getDataFolder(), "config.yml");
		
		if(!(file.exists())) {
			try {
				saveConfig();
				setupConfig(getConfig());
				getConfig().options().copyDefaults(true);
				saveConfig();
			} catch (Exception e){
				e.printStackTrace();
			}
		}
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
	}
	
	public void onDisable() {
		getLogger().info("Custom Enchants disabled!");
		reloadConfig();
	}
	
	private void setupConfig(FileConfiguration config) throws IOException {
		if (!new File(getDataFolder(), "RESET.FILE").exists()) {
			new File(getDataFolder(), "RESET.FILE").createNewFile();
			getConfig().addDefault("Poison1.Chance", 0.1);
			getConfig().addDefault("Poison2.Chance", 0.1);
			getConfig().addDefault("Poison3.Chance", 0.1);
			getConfig().addDefault("Poison4.Chance", 0.1);
			getConfig().addDefault("Poison5.Chance", 0.1);
			getConfig().addDefault("Slowness1.Chance", 0.1);
			getConfig().addDefault("Nausea1.Chance", 0.1);
			getConfig().addDefault("Wither1.Chance", 0.1);
			getConfig().addDefault("Weakness1.Chance", 0.1);
			getConfig().addDefault("Blindness1.Chance", 0.1);
		}
	}
	
	@EventHandler
	public void onPlayerInteractEvent(PlayerInteractEvent e) {
		Player p = (Player) e.getPlayer();
		
		if(e.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if(p.hasPermission("enchants.admin")) {
				if(e.getClickedBlock().getState() instanceof Sign) {
					if(p.getItemInHand().getType() == Material.GOLD_SWORD || p.getItemInHand().getType() ==  Material.WOOD_SWORD || p.getItemInHand().getType() == Material.IRON_SWORD || p.getItemInHand().getType() == Material.DIAMOND_SWORD || p.getItemInHand().getType() == Material.STONE_SWORD
							|| p.getItemInHand().getType() == Material.DIAMOND_HOE || p.getItemInHand().getType() == Material.IRON_HOE || p.getItemInHand().getType() == Material.GOLD_HOE || p.getItemInHand().getType() == Material.STONE_HOE || p.getItemInHand().getType() == Material.WOOD_HOE
							|| p.getItemInHand().getType() == Material.DIAMOND_AXE || p.getItemInHand().getType() == Material.IRON_AXE || p.getItemInHand().getType() == Material.STONE_AXE || p.getItemInHand().getType() == Material.GOLD_AXE || p.getItemInHand().getType() == Material.WOOD_AXE) {
						Sign s = (Sign) e.getClickedBlock().getState();
						ItemStack sword = p.getItemInHand();
						ItemMeta swordMeta = sword.getItemMeta();
						List<String> lore = new ArrayList<String>();
						
						if(s.getLine(0).equalsIgnoreCase("[Enchant]")) {
							if(s.getLine(1).equalsIgnoreCase("Slowness")) {
								if(s.getLine(2).equalsIgnoreCase("I")) {
									lore.add(ChatColor.GRAY + "Slowness I");
									if((swordMeta.getLore() != null)) {
										lore.addAll(swordMeta.getLore());
									}
									
									swordMeta.setLore(lore);
									sword.setItemMeta(swordMeta);
									
									p.sendMessage(ChatColor.GREEN + "[Custom Enchants] Successfully enchanted with slowness I!");
								}
							}
							
							if(s.getLine(1).equalsIgnoreCase("Poison")) {
								if(s.getLine(2).equals("I")){
									lore.add(ChatColor.GRAY + "Poison I");
									if(swordMeta.getLore() != null) {
										lore.addAll(swordMeta.getLore());
									}
									
									swordMeta.setLore(lore);
									sword.setItemMeta(swordMeta);
									
									p.sendMessage(ChatColor.GREEN + "[Custom Enchants] Successfully enchanted with poison I!");
								}
								
								if(s.getLine(2).equals("II")){
									lore.add(ChatColor.GRAY + "Poison II");
									if((swordMeta.getLore() != null)) {
										lore.addAll(swordMeta.getLore());
									}
									
									swordMeta.setLore(lore);
									sword.setItemMeta(swordMeta);
									
									p.sendMessage(ChatColor.GREEN + "[Custom Enchants] Successfully enchanted with poison II!");
								}
								
								if(s.getLine(2).equals("III")){
									lore.add(ChatColor.GRAY + "Poison III");
									if((swordMeta.getLore() != null)) {
										lore.addAll(swordMeta.getLore());
									}
									
									swordMeta.setLore(lore);
									sword.setItemMeta(swordMeta);
									
									p.sendMessage(ChatColor.GREEN + "[Custom Enchants] Successfully enchanted with poison III!");
								}
								
								if(s.getLine(2).equals("IV")){
									lore.add(ChatColor.GRAY + "Poison IV");
									if((swordMeta.getLore() != null)) {
										lore.addAll(swordMeta.getLore());
									}
									
									swordMeta.setLore(lore);
									sword.setItemMeta(swordMeta);
									
									p.sendMessage(ChatColor.GREEN + "[Custom Enchants] Successfully enchanted with poison IV!");
								}
								
								if(s.getLine(2).equals("V")){
									lore.add(ChatColor.GRAY + "Poison V");
									if((swordMeta.getLore() != null)) {
										lore.addAll(swordMeta.getLore());
									}
									
									swordMeta.setLore(lore);
									sword.setItemMeta(swordMeta);
									
									p.sendMessage(ChatColor.GREEN + "[Custom Enchants] Successfully enchanted with poison V!");
								}
							}
						}
							
					}
				}
			}
		}
	}
	
	@EventHandler
	public void onPlayerHitPlayer(EntityDamageByEntityEvent e) {
		if(e.getEntity() instanceof Player && e.getDamager() instanceof Player) {
			Player hit = (Player) e.getEntity();
			Player hitter = (Player) e.getDamager();
			
			if(hitter.getItemInHand().getItemMeta().hasLore()){
				for(String s : hitter.getItemInHand().getItemMeta().getLore()) {
					if(s.contains(ChatColor.stripColor("Poison I"))) {
						double chance = getConfig().getDouble("Poison1.Chance");
						if(Math.random() <= chance) {
							hit.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 100, 1));
						}
					}
					
					if(s.contains(ChatColor.stripColor("Poison II"))) {
						double chance = getConfig().getDouble("Poison2.Chance");
						if(Math.random() <= chance) {
							hit.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 100, 2));
						}
					}
					
					if(s.contains(ChatColor.stripColor("Poison III"))) {
						double chance = getConfig().getDouble("Poison3.Chance");
						if(Math.random() <= chance) {
							hit.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 100, 3));
						}
					}
					
					if(s.contains(ChatColor.stripColor("Poison IV"))) {
						double chance = getConfig().getDouble("Poison4.Chance");
						if(Math.random() <= chance) {
							hit.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 100, 4));
						}
					}
					
					if(s.contains(ChatColor.stripColor("Poison V"))) {
						double chance = getConfig().getDouble("Poison5.Chance");
						if(Math.random() <= chance) {
							hit.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 100, 5));
						}
					}
					
					if(s.contains(ChatColor.stripColor("Slowness I"))) {
						double chance = getConfig().getDouble("Slowness1.Chance");
						if(Math.random() <= chance) {
							hit.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100, 1));
						}
					}
				}
			}
		}
	}
	
	@EventHandler
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("ce")) {
			if(args.length == 1 && args[0].equalsIgnoreCase("reload")) {
				Bukkit.getPluginManager().disablePlugin(this);
				Bukkit.getPluginManager().enablePlugin(this);
			}
		}
		
		
		return false;
	}

}
