package com.io.region.region.command;

import com.io.region.region.api.*;
import com.io.region.region.implement.AreaImp;
import com.io.region.region.implement.MemberImp;
import com.io.region.region.implement.RegionImp;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class AreaCommand implements CommandExecutor, Permission, Protection {

    //추후 tabCompleter 업데이트 예정
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command cmd, @NotNull String label, @NotNull String[] args) {
        Player p = (Player) sender;
        Regions regions = new RegionImp();
        Member member = new MemberImp();
        Area area = new AreaImp();
        if (args.length == 0) {
            p.sendMessage("area command");
        } else {
            if (p.isOp()) { // 아직은 오피 제한
                switch (args[0]) {
                    case "permission": {
                        switch (args[1]) {
                            case "add": {
                                switch (args[2]) {
                                    case "exit": {
                                        String region = args[3];
                                        Player player = Bukkit.getPlayer(args[4]);
                                        if (player != null && (regions.isOwner(region, player) || player.isOp())) {
                                            p.sendMessage("플레이어 " + "[" + player + "]" + " 는 op 이거나 " + "[" + region + "]" + " 구역의 매니저입니다.");
                                        } else {
                                            if (member.isMember(player, region)) {
                                                area.addPermission(p, region, exit);
                                                p.sendMessage("[" + region + "]" + " 구역의 " + "[" + player + "]" + " 멤버에게 [exit] 권한을 주었습니다.");
                                            } else {
                                                p.sendMessage("플레이어 " + "[" + player + "]" + " 는 " + "[" + region + "]" + " 구역의 멤버가 아닙니다.");
                                            }
                                        }
                                        break;
                                    }
                                    case "entrance": {
                                        String region = args[3];
                                        Player player = Bukkit.getPlayer(args[4]);
                                        if (player != null && (regions.isOwner(region, player) || player.isOp())) {
                                            p.sendMessage("플레이어 " + "[" + player + "]" + " 는 op 이거나 " + "[" + region + "]" + " 구역의 매니저입니다.");
                                        } else {
                                            if (member.isMember(player, region)) {
                                                area.addPermission(p, region, entrance);
                                                p.sendMessage("[" + region + "]" + " 구역의 " + "[" + player + "]" + " 멤버에게 [entrance] 권한을 주었습니다.");
                                            } else {
                                                p.sendMessage("플레이어 " + "[" + player + "]" + " 는 " + "[" + region + "]" + " 구역의 멤버가 아닙니다.");
                                            }
                                        }
                                        break;
                                    }
                                    case "item_pick_up": {
                                        String region = args[3];
                                        Player player = Bukkit.getPlayer(args[4]);
                                        if (player != null && (regions.isOwner(region, player) || player.isOp())) {
                                            p.sendMessage("플레이어 " + "[" + player + "]" + " 는 op 이거나 " + "[" + region + "]" + " 구역의 매니저입니다.");
                                        } else {
                                            if (member.isMember(player, region)) {
                                                area.addPermission(p, region, item_pick_up);
                                                p.sendMessage("[" + region + "]" + " 구역의 " + "[" + player + "]" + " 멤버에게 [item_pick_up] 권한을 주었습니다.");
                                            } else {
                                                p.sendMessage("플레이어 " + "[" + player + "]" + " 는 " + "[" + region + "]" + " 구역의 멤버가 아닙니다.");
                                            }
                                        }
                                        break;
                                    }
                                    case "item_drop": {
                                        String region = args[3];
                                        Player player = Bukkit.getPlayer(args[4]);
                                        if (player != null && (regions.isOwner(region, player) || player.isOp())) {
                                            p.sendMessage("플레이어 " + "[" + player + "]" + " 는 op 이거나 " + "[" + region + "]" + " 구역의 매니저입니다.");
                                        } else {
                                            if (member.isMember(player, region)) {
                                                area.addPermission(p, region, item_drop);
                                                p.sendMessage("[" + region + "]" + " 구역의 " + "[" + player + "]" + " 멤버에게 [item_drop] 권한을 주었습니다.");
                                            } else {
                                                p.sendMessage("플레이어 " + "[" + player + "]" + " 는 " + "[" + region + "]" + " 구역의 멤버가 아닙니다.");
                                            }
                                        }
                                        break;
                                    }
                                    case "block_place": {
                                        String region = args[3];
                                        Player player = Bukkit.getPlayer(args[4]);
                                        if (player != null && (regions.isOwner(region, player) || player.isOp())) {
                                            p.sendMessage("플레이어 " + "[" + player + "]" + " 는 op 이거나 " + "[" + region + "]" + " 구역의 매니저입니다.");
                                        } else {
                                            if (member.isMember(player, region)) {
                                                area.addPermission(p, region, block_place);
                                                p.sendMessage("[" + region + "]" + " 구역의 " + "[" + player + "]" + " 멤버에게 [block_place] 권한을 주었습니다.");

                                            } else {
                                                p.sendMessage("플레이어 " + "[" + player + "]" + " 는 " + "[" + region + "]" + " 구역의 멤버가 아닙니다.");
                                            }
                                        }
                                        break;
                                    }
                                    case "block_break": {
                                        String region = args[3];
                                        Player player = Bukkit.getPlayer(args[4]);
                                        if (player != null && (regions.isOwner(region, player) || player.isOp())) {
                                            p.sendMessage("플레이어 " + "[" + player + "]" + " 는 op 이거나 " + "[" + region + "]" + " 구역의 매니저입니다.");
                                        } else {
                                            if (member.isMember(player, region)) {
                                                area.addPermission(p, region, block_break);
                                                p.sendMessage("[" + region + "]" + " 구역의 " + "[" + player + "]" + " 멤버에게 [block_break] 권한을 주었습니다.");
                                            } else {
                                                p.sendMessage("플레이어 " + "[" + player + "]" + " 는 " + "[" + region + "]" + " 구역의 멤버가 아닙니다.");
                                            }
                                        }
                                        break;
                                    }
                                    case "block_ignite": {
                                        String region = args[3];
                                        Player player = Bukkit.getPlayer(args[4]);
                                        if (player != null && (regions.isOwner(region, player) || player.isOp())) {
                                            p.sendMessage("플레이어 " + "[" + player + "]" + " 는 op 이거나 " + "[" + region + "]" + " 구역의 매니저입니다.");
                                        } else {
                                            if (member.isMember(player, region)) {
                                                area.addPermission(p, region, block_ignite);
                                                p.sendMessage("[" + region + "]" + " 구역의 " + "[" + player + "]" + " 멤버에게 [block_ignite] 권한을 주었습니다.");
                                            } else {
                                                p.sendMessage("플레이어 " + "[" + player + "]" + " 는 " + "[" + region + "]" + " 구역의 멤버가 아닙니다.");
                                            }
                                        }
                                        break;
                                    }
                                    case "hanging_place": {
                                        String region = args[3];
                                        Player player = Bukkit.getPlayer(args[4]);
                                        if (player != null && (regions.isOwner(region, player) || player.isOp())) {
                                            p.sendMessage("플레이어 " + "[" + player + "]" + " 는 op 이거나 " + "[" + region + "]" + " 구역의 매니저입니다.");
                                        } else {
                                            if (member.isMember(player, region)) {
                                                area.addPermission(p, region, hanging_place);
                                                p.sendMessage("[" + region + "]" + " 구역의 " + "[" + player + "]" + " 멤버에게 [hanging_place] 권한을 주었습니다.");
                                            } else {
                                                p.sendMessage("플레이어 " + "[" + player + "]" + " 는 " + "[" + region + "]" + " 구역의 멤버가 아닙니다.");
                                            }
                                        }
                                        break;
                                    }
                                    case "hanging_break": {
                                        String region = args[3];
                                        Player player = Bukkit.getPlayer(args[4]);
                                        if (player != null && (regions.isOwner(region, player) || player.isOp())) {
                                            p.sendMessage("플레이어 " + "[" + player + "]" + " 는 op 이거나 " + "[" + region + "]" + " 구역의 매니저입니다.");
                                        } else {
                                            if (member.isMember(player, region)) {
                                                area.addPermission(p, region, hanging_break);
                                                p.sendMessage("[" + region + "]" + " 구역의 " + "[" + player + "]" + " 멤버에게 [hanging_break] 권한을 주었습니다.");
                                            } else {
                                                p.sendMessage("플레이어 " + "[" + player + "]" + " 는 " + "[" + region + "]" + " 구역의 멤버가 아닙니다.");
                                            }
                                        }
                                        break;
                                    }
                                    case "bucket_fill": {
                                        String region = args[3];
                                        Player player = Bukkit.getPlayer(args[4]);
                                        if (player != null && (regions.isOwner(region, player) || player.isOp())) {
                                            p.sendMessage("플레이어 " + "[" + player + "]" + " 는 op 이거나 " + "[" + region + "]" + " 구역의 매니저입니다.");
                                        } else {
                                            if (member.isMember(player, region)) {
                                                area.addPermission(p, region, bucket_fill);
                                                p.sendMessage("[" + region + "]" + " 구역의 " + "[" + player + "]" + " 멤버에게 [bucket_fill] 권한을 주었습니다.");
                                            } else {
                                                p.sendMessage("플레이어 " + "[" + player + "]" + " 는 " + "[" + region + "]" + " 구역의 멤버가 아닙니다.");
                                            }
                                        }
                                        break;
                                    }
                                    case "projectile_launch": {
                                        String region = args[3];
                                        Player player = Bukkit.getPlayer(args[4]);
                                        if (player != null && (regions.isOwner(region, player) || player.isOp())) {
                                            p.sendMessage("플레이어 " + "[" + player + "]" + " 는 op 이거나 " + "[" + region + "]" + " 구역의 매니저입니다.");
                                        } else {
                                            if (member.isMember(player, region)) {
                                                area.addPermission(p, region, projectile_launch);
                                                p.sendMessage("[" + region + "]" + " 구역의 " + "[" + player + "]" + " 멤버에게 [projectile_launch] 권한을 주었습니다.");
                                            } else {
                                                p.sendMessage("플레이어 " + "[" + player + "]" + " 는 " + "[" + region + "]" + " 구역의 멤버가 아닙니다.");
                                            }
                                        }
                                        break;
                                    }
                                    case "interact": {
                                        String region = args[3];
                                        Player player = Bukkit.getPlayer(args[4]);
                                        if (player != null && (regions.isOwner(region, player) || player.isOp())) {
                                            p.sendMessage("플레이어 " + "[" + player + "]" + " 는 op 이거나 " + "[" + region + "]" + " 구역의 매니저입니다.");
                                        } else {
                                            if (member.isMember(player, region)) {
                                                area.addPermission(p, region, interact);
                                                p.sendMessage("[" + region + "]" + " 구역의 " + "[" + player + "]" + " 멤버에게 [interact] 권한을 주었습니다.");
                                            } else {
                                                p.sendMessage("플레이어 " + "[" + player + "]" + " 는 " + "[" + region + "]" + " 구역의 멤버가 아닙니다.");
                                            }
                                        }
                                        break;
                                    }
                                    case "bed_leave": {
                                        String region = args[3];
                                        Player player = Bukkit.getPlayer(args[4]);
                                        if (player != null && (regions.isOwner(region, player) || player.isOp())) {
                                            p.sendMessage("플레이어 " + "[" + player + "]" + " 는 op 이거나 " + "[" + region + "]" + " 구역의 매니저입니다.");
                                        } else {
                                            if (member.isMember(player, region)) {
                                                area.addPermission(p, region, bed_leave);
                                                p.sendMessage("[" + region + "]" + " 구역의 " + "[" + player + "]" + " 멤버에게 [bed_leave] 권한을 주었습니다.");
                                            } else {
                                                p.sendMessage("플레이어 " + "[" + player + "]" + " 는 " + "[" + region + "]" + " 구역의 멤버가 아닙니다.");
                                            }
                                        }
                                        break;
                                    }
                                    default: {
                                        p.sendMessage("그딴 argument 는 없어요~~");
                                        break;
                                    }
                                }
                                break;
                            }
                            case "remove": {
                                switch (args[2]) {
                                    case "exit": {
                                        String region = args[3];
                                        Player player = Bukkit.getPlayer(args[4]);
                                        if (player != null && (regions.isOwner(region, player) || player.isOp())) {
                                            p.sendMessage("플레이어 " + "[" + player + "]" + " 는 op 이거나 " + "[" + region + "]" + " 구역의 매니저입니다.");
                                        } else {
                                            if (member.isMember(player, region)) {
                                                area.removePermission(p, region, exit);
                                                p.sendMessage("[" + region + "]" + " 구역의 " + "[" + player + "]" + " 멤버에게 [exit] 권한을 제거했습니다.");
                                            } else {
                                                p.sendMessage("플레이어 " + "[" + player + "]" + " 는 " + "[" + region + "]" + " 구역의 멤버가 아닙니다.");
                                            }
                                        }
                                        break;
                                    }
                                    case "entrance": {
                                        String region = args[3];
                                        Player player = Bukkit.getPlayer(args[4]);
                                        if (player != null && (regions.isOwner(region, player) || player.isOp())) {
                                            p.sendMessage("플레이어 " + "[" + player + "]" + " 는 op 이거나 " + "[" + region + "]" + " 구역의 매니저입니다.");
                                        } else {
                                            if (member.isMember(player, region)) {
                                                area.removePermission(p, region, entrance);
                                                p.sendMessage("[" + region + "]" + " 구역의 " + "[" + player + "]" + " 멤버에게 [entrance] 권한을 제거했습니다.");
                                            } else {
                                                p.sendMessage("플레이어 " + "[" + player + "]" + " 는 " + "[" + region + "]" + " 구역의 멤버가 아닙니다.");
                                            }
                                        }
                                        break;
                                    }
                                    case "item_pick_up": {
                                        String region = args[3];
                                        Player player = Bukkit.getPlayer(args[4]);
                                        if (player != null && (regions.isOwner(region, player) || player.isOp())) {
                                            p.sendMessage("플레이어 " + "[" + player + "]" + " 는 op 이거나 " + "[" + region + "]" + " 구역의 매니저입니다.");
                                        } else {
                                            if (member.isMember(player, region)) {
                                                area.removePermission(p, region, item_pick_up);
                                                p.sendMessage("[" + region + "]" + " 구역의 " + "[" + player + "]" + " 멤버에게 [item_pick_up] 권한을 제거했습니다.");
                                            } else {
                                                p.sendMessage("플레이어 " + "[" + player + "]" + " 는 " + "[" + region + "]" + " 구역의 멤버가 아닙니다.");
                                            }
                                        }
                                        break;
                                    }
                                    case "item_drop": {
                                        String region = args[3];
                                        Player player = Bukkit.getPlayer(args[4]);
                                        if (player != null && (regions.isOwner(region, player) || player.isOp())) {
                                            p.sendMessage("플레이어 " + "[" + player + "]" + " 는 op 이거나 " + "[" + region + "]" + " 구역의 매니저입니다.");
                                        } else {
                                            if (member.isMember(player, region)) {
                                                area.removePermission(p, region, item_drop);
                                                p.sendMessage("[" + region + "]" + " 구역의 " + "[" + player + "]" + " 멤버에게 [item_drop] 권한을 제거했습니다.");
                                            } else {
                                                p.sendMessage("플레이어 " + "[" + player + "]" + " 는 " + "[" + region + "]" + " 구역의 멤버가 아닙니다.");
                                            }
                                        }
                                        break;
                                    }
                                    case "block_place": {
                                        String region = args[3];
                                        Player player = Bukkit.getPlayer(args[4]);
                                        if (player != null && (regions.isOwner(region, player) || player.isOp())) {
                                            p.sendMessage("플레이어 " + "[" + player + "]" + " 는 op 이거나 " + "[" + region + "]" + " 구역의 매니저입니다.");
                                        } else {
                                            if (member.isMember(player, region)) {
                                                area.removePermission(p, region, block_place);
                                                p.sendMessage("[" + region + "]" + " 구역의 " + "[" + player + "]" + " 멤버에게 [block_place] 권한을 제거했습니다.");

                                            } else {
                                                p.sendMessage("플레이어 " + "[" + player + "]" + " 는 " + "[" + region + "]" + " 구역의 멤버가 아닙니다.");
                                            }
                                        }
                                        break;
                                    }
                                    case "block_break": {
                                        String region = args[3];
                                        Player player = Bukkit.getPlayer(args[4]);
                                        if (player != null && (regions.isOwner(region, player) || player.isOp())) {
                                            p.sendMessage("플레이어 " + "[" + player + "]" + " 는 op 이거나 " + "[" + region + "]" + " 구역의 매니저입니다.");
                                        } else {
                                            if (member.isMember(player, region)) {
                                                area.removePermission(p, region, block_break);
                                                p.sendMessage("[" + region + "]" + " 구역의 " + "[" + player + "]" + " 멤버에게 [block_break] 권한을 제거했습니다.");
                                            } else {
                                                p.sendMessage("플레이어 " + "[" + player + "]" + " 는 " + "[" + region + "]" + " 구역의 멤버가 아닙니다.");
                                            }
                                        }
                                        break;
                                    }
                                    case "block_ignite": {
                                        String region = args[3];
                                        Player player = Bukkit.getPlayer(args[4]);
                                        if (player != null && (regions.isOwner(region, player) || player.isOp())) {
                                            p.sendMessage("플레이어 " + "[" + player + "]" + " 는 op 이거나 " + "[" + region + "]" + " 구역의 매니저입니다.");
                                        } else {
                                            if (member.isMember(player, region)) {
                                                area.removePermission(p, region, block_ignite);
                                                p.sendMessage("[" + region + "]" + " 구역의 " + "[" + player + "]" + " 멤버에게 [block_ignite] 권한을 제거했습니다.");
                                            } else {
                                                p.sendMessage("플레이어 " + "[" + player + "]" + " 는 " + "[" + region + "]" + " 구역의 멤버가 아닙니다.");
                                            }
                                        }
                                        break;
                                    }
                                    case "hanging_place": {
                                        String region = args[3];
                                        Player player = Bukkit.getPlayer(args[4]);
                                        if (player != null && (regions.isOwner(region, player) || player.isOp())) {
                                            p.sendMessage("플레이어 " + "[" + player + "]" + " 는 op 이거나 " + "[" + region + "]" + " 구역의 매니저입니다.");
                                        } else {
                                            if (member.isMember(player, region)) {
                                                area.removePermission(p, region, hanging_place);
                                                p.sendMessage("[" + region + "]" + " 구역의 " + "[" + player + "]" + " 멤버에게 [hanging_place] 권한을 제거했습니다.");
                                            } else {
                                                p.sendMessage("플레이어 " + "[" + player + "]" + " 는 " + "[" + region + "]" + " 구역의 멤버가 아닙니다.");
                                            }
                                        }
                                        break;
                                    }
                                    case "hanging_break": {
                                        String region = args[3];
                                        Player player = Bukkit.getPlayer(args[4]);
                                        if (player != null && (regions.isOwner(region, player) || player.isOp())) {
                                            p.sendMessage("플레이어 " + "[" + player + "]" + " 는 op 이거나 " + "[" + region + "]" + " 구역의 매니저입니다.");
                                        } else {
                                            if (member.isMember(player, region)) {
                                                area.removePermission(p, region, hanging_break);
                                                p.sendMessage("[" + region + "]" + " 구역의 " + "[" + player + "]" + " 멤버에게 [hanging_break] 권한을 제거했습니다.");
                                            } else {
                                                p.sendMessage("플레이어 " + "[" + player + "]" + " 는 " + "[" + region + "]" + " 구역의 멤버가 아닙니다.");
                                            }
                                        }
                                        break;
                                    }
                                    case "bucket_fill": {
                                        String region = args[3];
                                        Player player = Bukkit.getPlayer(args[4]);
                                        if (player != null && (regions.isOwner(region, player) || player.isOp())) {
                                            p.sendMessage("플레이어 " + "[" + player + "]" + " 는 op 이거나 " + "[" + region + "]" + " 구역의 매니저입니다.");
                                        } else {
                                            if (member.isMember(player, region)) {
                                                area.removePermission(p, region, bucket_fill);
                                                p.sendMessage("[" + region + "]" + " 구역의 " + "[" + player + "]" + " 멤버에게 [bucket_fill] 권한을 제거했습니다.");
                                            } else {
                                                p.sendMessage("플레이어 " + "[" + player + "]" + " 는 " + "[" + region + "]" + " 구역의 멤버가 아닙니다.");
                                            }
                                        }
                                        break;
                                    }
                                    case "projectile_launch": {
                                        String region = args[3];
                                        Player player = Bukkit.getPlayer(args[4]);
                                        if (player != null && (regions.isOwner(region, player) || player.isOp())) {
                                            p.sendMessage("플레이어 " + "[" + player + "]" + " 는 op 이거나 " + "[" + region + "]" + " 구역의 매니저입니다.");
                                        } else {
                                            if (member.isMember(player, region)) {
                                                area.removePermission(p, region, projectile_launch);
                                                p.sendMessage("[" + region + "]" + " 구역의 " + "[" + player + "]" + " 멤버에게 [projectile_launch] 권한을 제거했습니다.");
                                            } else {
                                                p.sendMessage("플레이어 " + "[" + player + "]" + " 는 " + "[" + region + "]" + " 구역의 멤버가 아닙니다.");
                                            }
                                        }
                                        break;
                                    }
                                    case "interact": {
                                        String region = args[3];
                                        Player player = Bukkit.getPlayer(args[4]);
                                        if (player != null && (regions.isOwner(region, player) || player.isOp())) {
                                            p.sendMessage("플레이어 " + "[" + player + "]" + " 는 op 이거나 " + "[" + region + "]" + " 구역의 매니저입니다.");
                                        } else {
                                            if (member.isMember(player, region)) {
                                                area.removePermission(p, region, interact);
                                                p.sendMessage("[" + region + "]" + " 구역의 " + "[" + player + "]" + " 멤버에게 [interact] 권한을 제거했습니다.");
                                            } else {
                                                p.sendMessage("플레이어 " + "[" + player + "]" + " 는 " + "[" + region + "]" + " 구역의 멤버가 아닙니다.");
                                            }
                                        }
                                        break;
                                    }
                                    case "bed_leave": {
                                        String region = args[3];
                                        Player player = Bukkit.getPlayer(args[4]);
                                        if (player != null && (regions.isOwner(region, player) || player.isOp())) {
                                            p.sendMessage("플레이어 " + "[" + player + "]" + " 는 op 이거나 " + "[" + region + "]" + " 구역의 매니저입니다.");
                                        } else {
                                            if (member.isMember(player, region)) {
                                                area.removePermission(p, region, bed_leave);
                                                p.sendMessage("[" + region + "]" + " 구역의 " + "[" + player + "]" + " 멤버에게 [bed_leave] 권한을 제거했습니다.");
                                            } else {
                                                p.sendMessage("플레이어 " + "[" + player + "]" + " 는 " + "[" + region + "]" + " 구역의 멤버가 아닙니다.");
                                            }
                                        }
                                        break;
                                    }
                                    default: {
                                        p.sendMessage("그딴 argument 는 없어요~~");
                                        break;
                                    }
                                }
                                break;
                            }
                            default: {
                                p.sendMessage("그딴 argument 는 없어요~~");
                                break;
                            }
                        }
                        break;
                    }
                    case "protection": {
                        switch (args[1]) {
                            case "add": {
                                switch (args[2]) {
                                    case "damage": {
                                        String region = args[3];
                                        if (regions.hasRegion(region)) {
                                            area.addProtection(region, damage);
                                            p.sendMessage("[" + region + "]" + " 구역에 [damage] 보호를 추가했습니다.");
                                        }
                                        break;
                                    }
                                    case "potion": {
                                        String region = args[3];
                                        if (regions.hasRegion(region)) {
                                            area.addProtection(region, potion);
                                            p.sendMessage("[" + region + "]" + " 구역에 [potion] 보호를 추가했습니다.");
                                        }
                                        break;
                                    }
                                    case "explosion": {
                                        String region = args[3];
                                        if (regions.hasRegion(region)) {
                                            area.addProtection(region, explosion);
                                            p.sendMessage("[" + region + "]" + " 구역에 [explosion] 보호를 추가했습니다.");
                                        }
                                        break;
                                    }
                                    case "piston": {
                                        String region = args[3];
                                        if (regions.hasRegion(region)) {
                                            area.addProtection(region, piston);
                                            p.sendMessage("[" + region + "]" + " 구역에 [piston] 보호를 추가했습니다.");
                                        }
                                        break;
                                    }
                                    case "red_stone": {
                                        String region = args[3];
                                        if (regions.hasRegion(region)) {
                                            area.addProtection(region, red_stone);
                                            p.sendMessage("[" + region + "]" + " 구역에 [red_stone] 보호를 추가했습니다.");
                                        }
                                        break;
                                    }
                                    case "fire": {
                                        String region = args[3];
                                        if (regions.hasRegion(region)) {
                                            area.addProtection(region, fire);
                                            p.sendMessage("[" + region + "]" + " 구역에 [fire] 보호를 추가했습니다.");
                                        }
                                        break;
                                    }
                                }
                                break;
                            }
                            case "remove": {
                                switch (args[2]) {
                                    case "damage": {
                                        String region = args[3];
                                        if (regions.hasRegion(region)) {
                                            area.removeProtection(region, damage);
                                            p.sendMessage("[" + region + "]" + " 구역에 [damage] 보호를 제거했습니다.");
                                        }
                                        break;
                                    }
                                    case "potion": {
                                        String region = args[3];
                                        if (regions.hasRegion(region)) {
                                            area.removeProtection(region, potion);
                                            p.sendMessage("[" + region + "]" + " 구역에 [potion] 보호를 제거했습니다.");
                                        }
                                        break;
                                    }
                                    case "explosion": {
                                        String region = args[3];
                                        if (regions.hasRegion(region)) {
                                            area.removeProtection(region, explosion);
                                            p.sendMessage("[" + region + "]" + " 구역에 [explosion] 보호를 제거했습니다.");
                                        }
                                        break;
                                    }
                                    case "piston": {
                                        String region = args[3];
                                        if (regions.hasRegion(region)) {
                                            area.removeProtection(region, piston);
                                            p.sendMessage("[" + region + "]" + " 구역에 [piston] 보호를 제거했습니다.");
                                        }
                                        break;
                                    }
                                    case "red_stone": {
                                        String region = args[3];
                                        if (regions.hasRegion(region)) {
                                            area.removeProtection(region, red_stone);
                                            p.sendMessage("[" + region + "]" + " 구역에 [red_stone] 보호를 제거했습니다.");
                                        }
                                        break;
                                    }
                                    case "fire": {
                                        String region = args[3];
                                        if (regions.hasRegion(region)) {
                                            area.removeProtection(region, fire);
                                            p.sendMessage("[" + region + "]" + " 구역에 [fire] 보호를 제거했습니다.");
                                        }
                                        break;
                                    }
                                }
                                break;
                            }
                            default: {
                                p.sendMessage("그딴 argument 는 없어요~~");
                                break;
                            }
                        }
                        break;
                    }
                    default: {
                        p.sendMessage("그딴 argument 는 없어요~~");
                        break;
                    }
                }
            } else {
                p.sendMessage("당신은 오피가 아닙니다.");
            }
        }
        return false;
    }
}
