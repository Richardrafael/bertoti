import './style.css'
import Menu from '../../components/menu'
import { useState } from 'react';
import NumberFormat from 'react-number-format';

function ContratoEnergia(){
    const [concessionaria, setConcessionaria] = useState('')        //marcar como novo no cadastro 
    const [cnpj_concessionaria, setCnpj_concessionaria] = useState('') //marcar como novo no cadastro
    const [nome_cliente, setNome_cliente] = useState('')
    const [cpf_cnpj_cliente, setCpf_cnpj_cliente] = useState('')
    const [codigo_identificador, setCodigo_identificador] = useState('')
    const [codigo_fiscal, setCodigo_fiscal] = useState('')
    const [grupo_sub, setGrupo_sub] = useState('')
    const [classe_sub, setClase_sub] = useState('')
    const [tp_fornecimento, setTp_fornecimento] = useState('')
    const [modalidade_taf, setModalidade_taf] = useState('')
    const [tensao_nominal, setTensao_nominal] = useState('')
    const [roteiro_leitura, setRoteiro_leitura] = useState('')
    const [medidor, setMedidor] = useState('')
    const [valor_medio, setValor_medio] = useState('')
    const [end_eletrico, setEnd_eletrico] = useState('')
    const [cpf_cnpj_ci, setCpf_cnpj_ci] = useState('')
    const [cep_consumo, setCep_consumo] = useState('')
    const [rua_consumo, setRua_consumo] = useState('')
    const [bairro_consumo, setBairro_consumo] = useState('')
    const [cidade_consumo, setCidade_consumo] = useState('')
    const [estado_consumo, setEstado_consumo] = useState('')
    const [nResidencial_empresarial, setNResidencial_empresarial] = useState('')
    
    async function handleSubmit(event){
        event.preventDefault()
        const dado ={
            concessionaria:concessionaria,          
            concessionaria_cnpj:cnpj_concessionaria,  
            nome_unidade:nome_cliente, 
            cpf_cnpj:cpf_cnpj_cliente, 
            codigo_identificador:codigo_identificador, 
            codigo_fiscal_operacao:codigo_fiscal, 
            grupo_subgrupo:grupo_sub, 
            classe_subclasse:classe_sub, 
            tp_fornecimento:tp_fornecimento, 
            modalidade_tarifaria:modalidade_taf, 
            tensao_nominal:tensao_nominal, 
            roteiro_leitura:roteiro_leitura, 
            num_medidor:medidor, 
            valor_medio:valor_medio, 
            endereco_eletrico:end_eletrico, 
            cnpj_cpf_ci:cpf_cnpj_ci, 
            local_cep:cep_consumo, 
            local_rua:rua_consumo, 
            local_bairro:bairro_consumo, 
            local_cidade:cidade_consumo, 
            local_estado:estado_consumo, 
            local_numero:nResidencial_empresarial, 
        }

        try {
            await fetch("http://localhost:8080/contratoenergia/cadastro", {
              method: "POST",
              headers: {
                  "Content-Type": "application/json",
            },
              body: JSON.stringify(dado)
            })
            setConcessionaria('')
            setCnpj_concessionaria('')
            setNome_cliente('')
            setCpf_cnpj_cliente('')
            setCodigo_identificador('')
            setCodigo_fiscal('')
            setGrupo_sub('')
            setClase_sub('')
            setTp_fornecimento('')
            setModalidade_taf('')
            setTensao_nominal('')
            setRoteiro_leitura('')
            setMedidor('')
            setValor_medio('')
            setEnd_eletrico('')
            setCpf_cnpj_ci('')
            setCep_consumo('')
            setRua_consumo('')
            setBairro_consumo('')
            setCidade_consumo('')
            setEstado_consumo('')
            setNResidencial_empresarial('')
            return;
        } catch (error) {
            return console.log(error.message);
        }
    }
            
    
    
    return(
        <div className="c_contrato_energia">  
            <Menu/>
            <div className='containerEnergia'>
                <h1 className="titulo">Cadastro de Contrato de Energia</h1>
                <div className= "cadastro">
                    <form name="cadastro_contrato_Energia" onSubmit={handleSubmit}>
                        <div className='coluna'>
                            <input 
                                id="concessionaria" 
                                type="text" 
                                required={true}
                                placeholder="Concessionaria" 
                                value={concessionaria}
                                onChange={(e) => setConcessionaria(e.target.value)}
                            />
                            <input 
                                id="cnpj_concessionaria" 
                                type="text"
                                required={true} 
                                placeholder="CNPJ Concessionaria" 
                                value={cnpj_concessionaria}
                                onChange={(e) => setCnpj_concessionaria(e.target.value)}
                            />
                            <input 
                                id="nome_cliente" 
                                type="text" 
                                required={true}
                                placeholder="Nome Cliente" 
                                value={nome_cliente}
                                onChange={(e) => setNome_cliente(e.target.value)}
                            />
                        </div> 
                        <div className='coluna'>
                            <input 
                                id="cnpj_cpf_cliente" 
                                type="text" 
                                required={true}
                                placeholder="CNPJ/CPF cliente" 
                                value={cpf_cnpj_cliente}
                                onChange={(e) => setCpf_cnpj_cliente(e.target.value)}
                            />
                            <input 
                                id="codigo_identificador" 
                                type="number" 
                                required={true}
                                placeholder="Cod.identificador" 
                                value={codigo_identificador}
                                onChange={(e) => setCodigo_identificador(e.target.value)}
                            />
                            <input 
                                id="codigo_fiscal"                              
                                type="text"
                                required={true} 
                                placeholder="Código Fiscal Operação"
                                value={codigo_fiscal}
                                onChange={(e) => setCodigo_fiscal(e.target.value)} 
                            />
                        </div> 
                        <div className='coluna'>
                            <input 
                                id="grupo_sub"                              
                                type="text" 
                                placeholder="Grupo/Subgrupo"  
                                value={grupo_sub}
                                onChange={(e) => setGrupo_sub(e.target.value)}
                            />
                            <input 
                                id="classe_sub"  
                                type="text" 
                                placeholder="Classe/Subclasse" 
                                value={classe_sub}
                                onChange={(e) => setClase_sub(e.target.value)} 
                            />
                            <input 
                                id="tp_fornecimento" 
                                type="text" 
                                required={true}
                                placeholder="TP Fornecimento"
                                value={tp_fornecimento}
                                onChange={(e) => setTp_fornecimento(e.target.value)}  
                            />
                            
                        </div>
                        <div className='coluna'>
                            <input 
                                id="modalidade_taf" 
                                type="text" 
                                placeholder="Modalidade Tarifaria"
                                value={modalidade_taf}
                                onChange={(e) => setModalidade_taf(e.target.value)}  
                            />
                            <input 
                                id="tensao_nominal" 
                                type="text" 
                                placeholder="Tensão Nominal"
                                value={tensao_nominal}
                                onChange={(e) => setTensao_nominal(e.target.value)}  
                            />
                            <input 
                                id="roteiro_leitura" 
                                type="text" 
                                placeholder="Roteiro de Leitura"
                                value={roteiro_leitura}
                                onChange={(e) => setRoteiro_leitura(e.target.value)}  
                            />
                        </div>
                        <div className='coluna'>
                            <input 
                                id="medidor" 
                                type="text" 
                                placeholder="Nª Medidor"
                                value={medidor}
                                onChange={(e) => setMedidor(e.target.value)}  
                            />
                            <NumberFormat 
                                prefix={'R$ '} 
                                id="valor_medio"   
                                floatValue = {true}
                                value={valor_medio}
                                required={true}
                                placeholder="Valor Medio (R$)"
                                onValueChange = { ( valores )  =>  { 
                                const  {floatValue}  =  valores ; 
                                setValor_medio ( floatValue  ) ;                                 
                                } }
                            />
                        </div> 
                        <p>Local de Consumo</p>
                        <div className='coluna'>
                            <input 
                                id="end_eletrico" 
                                type="text" 
                                required={true}
                                placeholder="End.Eletrico"
                                value={end_eletrico}
                                onChange={(e) => setEnd_eletrico(e.target.value)}   
                            />
                            <input 
                                id="Cpf_cnpj_ci" 
                                type="text" 
                                required={true} 
                                placeholder="CPF/CNPJ/CI"
                                value={cpf_cnpj_ci}
                                onChange={(e) => setCpf_cnpj_ci(e.target.value)} 
                            />
                            <input 
                                id="cep_consumo" 
                                type="text" 
                                required={true} 
                                placeholder="CEP "
                                value={cep_consumo}
                                onChange={(e) => setCep_consumo(e.target.value)}
                            />
                        </div> 
                        <div className='coluna'>
                            <input 
                                id="rua_consumo" 
                                type="text" 
                                placeholder="Rua"
                                value={rua_consumo}
                                onChange={(e) => setRua_consumo(e.target.value)} 
                            />
                            <input 
                                id="bairro_consumo" 
                                type="text" 
                                placeholder="Bairro"
                                value={bairro_consumo}
                                onChange={(e) => setBairro_consumo(e.target.value)} 
                            />
                            <input 
                                id="cidade_consumo" 
                                type="text" 
                                placeholder="Cidade"
                                value={cidade_consumo}
                                onChange={(e) => setCidade_consumo(e.target.value)}   
                            />
                        </div> 
                        <div className='coluna'>    
                            <input 
                                id="estado_consumo" 
                                type="text" 
                                placeholder="Estado"
                                value={estado_consumo}
                                onChange={(e) => setEstado_consumo(e.target.value)}
                            />
                            <input 
                                id="nResidencial_Empresarial"                             
                                type="text" 
                                placeholder="Nª Residencial/Empresarial" 
                                value={nResidencial_empresarial}
                                onChange={(e) => setNResidencial_empresarial(e.target.value)}
                            />
                        </div> 
                               
                        <div className="bt-container">
                            <button type="submit" className="cadastrar" id="botao_cad">ENVIAR</button>
                            {/* <p>Cadastro realizado com exito</p> */}
                        </div>
                    </form>
                </div>
            </div>
        </div>
    );
}

export default ContratoEnergia