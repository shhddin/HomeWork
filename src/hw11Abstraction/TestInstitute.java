package hw11Abstraction;

public class TestInstitute {
	public static void main(String[] args) {

		ColumbiaUniversity cu = new ColumbiaUniversity();

		cu.aeronauticalInfo();
		cu.anatomyLab();
		cu.anthropology();
		ColumbiaUniversity.biochemistryLab();
		ColumbiaUniversity.biology();
		cu.cafeteria();
		cu.caring();
		cu.commonRoom();
		cu.computerLab();
		cu.dorm();
		cu.emergencyRoom();
		cu.gymnasium();
		cu.hygiene();
		cu.laboratory();
		cu.languageClub();
		cu.lassSize();
		cu.lawInfo();
		cu.maths();
		cu.mechanicalLab();
		cu.morgue();
		cu.playGround();
		cu.surgeryRoom();
		cu.teacher();
		cu.vocationalInfo();

		System.out.println("\n........................>");

		University u = new University() {

			@Override
			public void surgeryRoom() {
				// TODO Auto-generated method stub

			}

			@Override
			public void emergencyRoom() {
				// TODO Auto-generated method stub

			}

			@Override
			public void cafeteria() {
				// TODO Auto-generated method stub

			}

			@Override
			public void languageClub() {
				// TODO Auto-generated method stub

			}

			@Override
			public void laboratory() {
				// TODO Auto-generated method stub

			}

			@Override
			public void commonRoom() {
				// TODO Auto-generated method stub

			}

			@Override
			public void teacher() {
				// TODO Auto-generated method stub

			}

			@Override
			public void playGround() {
				// TODO Auto-generated method stub

			}

			@Override
			public void lassSize() {
				// TODO Auto-generated method stub

			}
		};
		u.cafeteria();
		u.commonRoom();
		u.dorm();
		u.emergencyRoom();
		u.gymnasium();
		u.laboratory();
		u.languageClub();
		u.lassSize();
		u.morgue();
		u.playGround();
		u.surgeryRoom();
		u.teacher();
		University.library();

		System.out.println("\n........................>");

		MedicalSchool ms = new MedicalSchool() {

			@Override
			public void lawInfo() {
				// TODO Auto-generated method stub

			}

			@Override
			public void hygiene() {
				// TODO Auto-generated method stub

			}

			@Override
			public void anatomyLab() {
				// TODO Auto-generated method stub

			}
		};
		ms.aeronauticalInfo();
		ms.anatomyLab();
		ms.anthropology();
		MedicalSchool.biochemistryLab();
		ms.caring();
		ms.computerLab();
		ms.hygiene();
		ms.lawInfo();
		ms.maths();
		ms.mechanicalLab();

	}
}
