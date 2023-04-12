package map.busan.animal.hospital.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ItemVO {
	private String gugun;
	private String road_address;
	private String approval;
	private String tel;
	private String basic_date;
	private String lon;
	private String lat;
	private String animal_hospital;

}
