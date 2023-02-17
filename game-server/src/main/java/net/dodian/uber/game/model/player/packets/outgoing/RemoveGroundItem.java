package net.dodian.uber.game.model.player.packets.outgoing;

import net.dodian.uber.game.model.Position;
import net.dodian.uber.game.model.entity.player.Client;
import net.dodian.uber.game.model.item.GameItem;
import net.dodian.uber.game.model.player.packets.OutgoingPacket;

public class RemoveGroundItem implements OutgoingPacket {

    private GameItem item;
    private Position position;

    public RemoveGroundItem(GameItem item, Position position) {
        this.item = item;
        this.position = position;
    }

    @Override
    public void send(Client client) {
        client.getOutputStream().createFrame(85);
        client.getOutputStream().writeByteC(position.getY() - (client.mapRegionY * 8));
        client.getOutputStream().writeByteC(position.getX() - (client.mapRegionX * 8));
        client.getOutputStream().createFrame(156);
        client.getOutputStream().writeByteS(position.getZ());
        client.getOutputStream().writeWord(item.getId());
    }

}
