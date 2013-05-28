package org.emaginalabs.demo.jaxws.cxf.ws;

import org.emaginalabs.demo.jaxws.cxf.model.Player;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.List;

/**
 * User: jaluque
 * Date: 28/05/13
 * Time: 13:36
 */
@WebService
public interface ITeamService {
    List<Player> getTeam();

    List<Player> getPlayers(int... numbers);

    @WebMethod(operationName="actualizar")
    boolean updatePlayerByNumber(int number, Player player);

    boolean deletePlayer(int number);

    void foo();
}
