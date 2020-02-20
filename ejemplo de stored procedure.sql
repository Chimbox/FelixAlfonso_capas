-- ALTER TABLE socio ADD num_barcos INT NOT NULL DEFAULT 0;

DELIMITER $$
CREATE PROCEDURE actualizarNumBarcos(IN socio_id INT)
BEGIN
	DECLARE numBarcos INT;
	SET numBarcos = (SELECT COUNT(*) FROM barco B WHERE B.socio_id = socio_id);
	UPDATE socio s SET num_barcos=numBarcos WHERE s.id=socio_id;
    SELECT numBarcos;
END $$

drop procedure actualizarNumBarcos;