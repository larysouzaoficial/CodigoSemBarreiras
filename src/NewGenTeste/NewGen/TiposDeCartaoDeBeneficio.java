package NewGenTeste.NewGen;

public enum TiposDeCartaoDeBeneficio {
    VA {
        @Override
        public InterfaceCartaoDeBeneficiosNewGen fabricar() {
            return new ValeAlimentacao();
        }
    },
    VR {
        @Override
        public InterfaceCartaoDeBeneficiosNewGen fabricar() {
            return new ValeRefeicao();
        }
    },
    VC {
        @Override
        public InterfaceCartaoDeBeneficiosNewGen fabricar() {
            return new ValeCombustivel();
        }
    },
    MB {
        @Override
        public InterfaceCartaoDeBeneficiosNewGen fabricar() {
            return new Multibeneficios();
        }
    };

    abstract InterfaceCartaoDeBeneficiosNewGen fabricar();
}