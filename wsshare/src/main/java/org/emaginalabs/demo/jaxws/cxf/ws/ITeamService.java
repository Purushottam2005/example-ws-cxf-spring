package org.emaginalabs.demo.jaxws.cxf.ws;

import org.emaginalabs.demo.jaxws.cxf.model.Player;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;


@WebService
public interface ITeamService
{
    List<Player> getTeam();

    List<Player> getPlayers(int... numbers);

    @WebMethod(operationName="actualizar")
    boolean updatePlayerByNumber(int number, Player player);

    boolean deletePlayer(int number);

}