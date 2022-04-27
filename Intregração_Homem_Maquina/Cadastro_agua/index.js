// import './style.css'
// import Menu from '../../components/menu'
// import { useState } from 'react';

// function ContaEnergia(){
//     const [fornecimento, setFornecimento] = useState('')
//     const [concessionaria, setConcessionaria] = useState('')
//     const [cnpj, setCnpj] = useState('')
//     const [documento, setDocumento] = useState('')
//     const [dataEmissao, setDataEmissao] = useState('')
//     const [cpf, setCpf] = useState('')
//     const [nomeCliente, setNomeCliente] = useState('')
//     const [economias, setEconomias] = useState('')
//     const [dataApresentacao, setDataApresentacao] = useState('')
//     const [proximaLeitura, setProximaLeitura] = useState('')
//     const [tLigacao, setTLigacao] = useState('')
//     const [condicao, setCondicao] = useState('')
//     const [consumo, setConsumo] = useState('')
//     const [periodoConsumo, setPeriodoConsumo] = useState('')
//     const [mediaConsumo, setMediaConsumo] = useState('')
//     const [vtAgua, setVtAgua] = useState('')
//     const [vlEsgoto, setVlEsgoto] = useState('')
//     const [vtConsumo, setVtConsumo] = useState('')
//     const [multa, setMulta] = useState('')
//     const [jurosMoradia, setJurosMoradia] = useState('')
//     const [taxa, setTaxa] = useState('')
//     const [valorTributos, setValorTributos] = useState('')
//     const [valorTotal, setValorTotal] = useState('')
//     const [dataVencimento, setDataVencimento] = useState('')

//     async function handleSubmit(event){
//         event.preventDefault()

//         const dados = {
//             dado: fornecimento 
//         }


//         try {
//             await fetch("rota do backend", {
//                 method: "POST",
//                 headers: {
//                     "Content-Type": "application/json",
//             },
//                 body: JSON.stringify(dados),
//             })
            
//             setFornecimento('')
//             setConcessionaria('')
//             setCnpj('')
//             setDocumento('')
//             setDataEmissao('')
//             setCpf('')
//             setNomeCliente('')
//             setEconomias('')
//             setDataApresentacao('')
//             setProximaLeitura('')
//             setTLigacao('')
//             setCondicao('')
//             setConsumo('')
//             setPeriodoConsumo('')
//             setMediaConsumo('')
//             setVtAgua('')
//             setVlEsgoto('')
//             setVtConsumo('')
//             setMulta('')
//             setJurosMoradia('')
//             setTaxa('')
//             setValorTributos('')
//             setValorTotal('')
//             setDataVencimento('')
//             return;
//         } catch (error) {
//             return console.log(error.message);
//         }
//     }

//     return(
//         <div className="c_energia">  
//             <Menu/>
//             <div className='containerEnergia'>
//                 <h1 className="titulo">Cadastro de Conta de Água</h1>
//                 <div className= "cadastro">
//                     <form name="cadastro_agua" onSubmit={handleSubmit}>
//                         <div className='coluna'>
//                             <input 
//                                 id="fornecimento" 
//                                 type="text" 
//                                 placeholder="Fornecimento" 
//                                 value={fornecimento}
//                                 onChange={(e) => setFornecimento(e.target.value)}
//                             />
//                             <input 
//                                 id="concessionaria" 
//                                 type="text" 
//                                 placeholder="Concessionaria " 
//                                 value={concessionaria}
//                                 onChange={(e) => setConcessionaria(e.target.value)}
//                             />
//                         </div> 
//                         <div className='coluna'>
//                             <input 
//                                 id="CNPJ"                              
//                                 type="number" 
//                                 placeholder="CNPJ"
//                                 value={cnpj}
//                                 onChange={(e) => setCnpj(e.target.value)} 
//                             />
//                             <input 
//                                 id="documento"                              
//                                 type="number" 
//                                 placeholder="Nª do Documento"  
//                                 value={documento}
//                                 onChange={(e) => setDocumento(e.target.value)}
//                             />
//                             <input 
//                                 id="dataEmissao"  
//                                 type="text" 
//                                 placeholder="Data de Emissão" 
//                                 value={dataEmissao}
//                                 onChange={(e) => setDataEmissao(e.target.value)} 
//                             />
//                         </div> 
//                         <div className='coluna'>
//                             <input 
//                                 id="CPF" 
//                                 type="number" 
//                                 placeholder="CPF"
//                                 value={cpf}
//                                 onChange={(e) => setCpf(e.target.value)}  
//                             />
//                             <input 
//                                 id="nome" 
//                                 type="text" 
//                                 placeholder="Nome cliente "
//                                 value={nomeCliente}
//                                 onChange={(e) => setNomeCliente(e.target.value)}  
//                             />
//                         </div> 
//                         <div className='coluna'>
//                             <input 
//                                 id="economias" 
//                                 type="number" 
//                                 placeholder="Economias"
//                                 value={economias}
//                                 onChange={(e) => setEconomias(e.target.value)}   
//                             />
//                             <input 
//                                 id="dataApresentacao" 
//                                 type="text"  
//                                 placeholder="Data de Apresentação"
//                                 value={dataApresentacao}
//                                 onChange={(e) => setDataApresentacao(e.target.value)} 
//                             />
//                             <input 
//                                 id="proximaLeitura" 
//                                 type="number" 
//                                 placeholder="Proxima leitura"
//                                 value={proximaLeitura}
//                                 onChange={(e) => setProximaLeitura(e.target.value)}  
//                             />
//                             <input 
//                                 id="tLigação" 
//                                 type="text" 
//                                 placeholder="Tipo de ligação" 
//                                 value={tLigacao}
//                                 onChange={(e) => setTLigacao(e.target.value)} 
//                             />
//                         </div> 
//                         <div className='coluna'>
//                             <input 
//                                 id="condicao" 
//                                 type="number"  
//                                 placeholder="Condição"
//                                 value={condicao}
//                                 onChange={(e) => setCondicao(e.target.value)}
//                             />
//                             <input 
//                                 id="consumo" 
//                                 type="number" 
//                                 placeholder="Consumo"
//                                 value={consumo}
//                                 onChange={(e) => setConsumo(e.target.value)} 
//                             />
//                             <input 
//                                 id="periodoConsumo" 
//                                 type="data" 
//                                 placeholder="Periodo de Consumo"
//                                 value={periodoConsumo}
//                                 onChange={(e) => setPeriodoConsumo(e.target.value)} 
//                             />
//                             <input 
//                                 id="mediaConsumo" 
//                                 type="number"  
//                                 placeholder="Media de Consumo"
//                                 value={mediaConsumo}
//                                 onChange={(e) => setMediaConsumo(e.target.value)} 
//                             />
//                         </div> 
//                         <div className='coluna'>
//                             <input 
//                                 id="vtAgua" 
//                                 type="number" 
//                                 placeholder="Valor total da água "
//                                 value={vtAgua}
//                                 onChange={(e) => setVtAgua(e.target.value)}   
//                             />
//                             <input 
//                                 id="vlEsgoto" 
//                                 type="number" 
//                                 placeholder="Valor total esgoto"
//                                 value={vlEsgoto}
//                                 onChange={(e) => setVlEsgoto(e.target.value)}
//                             />
//                             <input 
//                                 id="VtConsumo"                             
//                                 type="number" 
//                                 placeholder="Valor total de Consumo" 
//                                 value={vtConsumo}
//                                 onChange={(e) => setVtConsumo(e.target.value)}
//                             />
//                         </div> 
//                         <div className='coluna'>
//                             <input 
//                                 id="multa" 
//                                 type="number" 
//                                 placeholder="Multa"
//                                 value={multa}
//                                 onChange={(e) => setMulta(e.target.value)} 
//                             />
//                             <input 
//                                 id="jurosMoradia" 
//                                 type="number" 
//                                 placeholder="Juros Moradia"
//                                 value={jurosMoradia}
//                                 onChange={(e) => setJurosMoradia(e.target.value)} 
//                             />
//                             <input 
//                                 id="taxa" 
//                                 type="number" 
//                                 placeholder="Taxa de Regulação"
//                                 value={taxa}
//                                 onChange={(e) => setTaxa(e.target.value)} 
//                             />
//                         </div> 
//                         <div className='coluna'>
//                             <input 
//                                 id="valortributos" 
//                                 type="number" 
//                                 placeholder="Valor tributos"
//                                 value={valorTributos}
//                                 onChange={(e) => setValorTributos(e.target.value)} 
//                             />
//                             <input 
//                                 id="ValorTotal" 
//                                 type="number" 
//                                 placeholder="Valor Total"
//                                 value={valorTotal}
//                                 onChange={(e) => setValorTotal(e.target.value)} 
//                             />
//                             <input 
//                                 id="datavencimento" 
//                                 type="data" 
//                                 placeholder="Data de Vencimento" 
//                                 value={dataVencimento}
//                                 onChange={(e) => setDataVencimento(e.target.value)} 
//                             />
//                         </div> 
                               
//                         <div className="bt-container">
//                             <button type='button' className="cadastrar" id="upload">UPLOAD</button>
//                             <button type="submit" className="cadastrar" id="botao_cad">ENVIAR</button>
//                             {/* <p>Cadastro realizado com exito</p> */}
//                         </div>
//                     </form>
//                 </div>
//             </div>
//         </div>
//     );
// }

// export default ContaEnergia