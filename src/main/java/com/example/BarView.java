package com.example;

import com.example.ui.CustomView;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.Label;

@UIScope
@SpringView
public class BarView extends CustomView {

	private static final long serialVersionUID = -2871248339830080422L;

	private static final String TEXT = "Lorem ipsum dolor sit amet, bar consectetur adipiscing elit. Cras pellentesque lectus purus, sed vehicula tortor bibendum sit amet. Curabitur porta dolor eu vulputate consectetur. Aenean mi leo, viverra sed tortor ac, tincidunt vulputate ex. Quisque tempus tempus tortor dictum ullamcorper. Vivamus et felis fermentum tortor finibus dapibus a in nisl. Nullam ornare faucibus pretium. Aliquam enim ipsum, congue et ligula et, bibendum elementum felis. Morbi euismod metus vel ante egestas faucibus. Integer pulvinar consectetur augue, vitae ornare ipsum efficitur ac. Cras in eros risus. Maecenas tristique turpis sit amet nulla dignissim molestie. Vivamus sollicitudin tortor dolor, non sagittis ex vehicula eget."
			+ "Vestibulum a sapien sed felis elementum convallis. Vivamus ultrices viverra odio, et molestie elit tempus vel. Nunc commodo felis id lectus tempus malesuada. Sed turpis lacus, ultrices ut magna vitae, pretium tempus dolor. Phasellus nec sem ac magna sodales lacinia. Quisque eget bibendum mi, sit amet porttitor elit. Morbi sit amet placerat nulla, vitae aliquam dolor. Curabitur pretium, quam at maximus gravida, lectus lacus posuere mauris, porttitor posuere arcu ligula quis urna. Mauris et tristique neque, in accumsan tellus. Pellentesque convallis eros ac nunc sagittis, vel varius erat tristique. Aliquam ac metus vitae dolor finibus dapibus a sed enim. Praesent suscipit eu nibh ac consequat. Curabitur mi purus, luctus aliquam commodo nec, congue ut arcu. Sed maximus at velit et accumsan. Pellentesque maximus ac orci id aliquam. Praesent sit amet venenatis metus, congue ullamcorper est."
			+ "Sed finibus rutrum justo. Proin laoreet lectus sed feugiat fermentum. Proin eleifend sem at augue pretium, id vehicula ipsum luctus. Suspendisse sagittis efficitur urna ac sollicitudin. In sed cursus tellus, id luctus tortor. Nunc ultrices finibus metus, ac porttitor turpis finibus vitae. In quis tellus ac nunc molestie mollis. Nunc mattis nulla quis viverra sollicitudin. Suspendisse imperdiet diam in libero molestie luctus ut vitae lacus. Etiam rhoncus mauris mi, sed efficitur felis semper a. Etiam commodo vehicula sem, id posuere sem tristique ac. Sed vel purus tortor. Ut id fringilla mi. Aenean aliquet purus sit amet sem molestie, ut dapibus libero scelerisque. Ut varius sem elit, sagittis ultricies metus maximus sed."
			+ "Pllentesque a lectus mattis, laoreet dolor et, tempus libero. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Curabitur venenatis, mi vel tincidunt mollis, nunc dolor finibus lacus, nec interdum dui libero ac enim. Proin sed enim dictum, eleifend nisi ut, pharetra mauris. Duis et odio sagittis, auctor arcu non, fringilla orci. Sed egestas orci id bibendum ullamcorper. Mauris augue sapien, luctus sit amet maximus ultricies, maximus eget justo. Pellentesque lorem nibh, tempus nec ornare et, gravida sed ipsum. Duis vel velit ut arcu vulputate pretium ut vitae metus. Vestibulum scelerisque lectus ut sapien blandit tempor. Curabitur sit amet tristique leo. Aenean faucibus tristique quam sit amet feugiat. Pellentesque a sollicitudin erat, iaculis vulputate augue. Pellentesque convallis nisl facilisis pellentesque feugiat."
			+ "Nulla sed diam pharetra, ultricies arcu non, ullamcorper ipsum. Suspendisse nibh turpis, cursus laoreet interdum ac, facilisis non mi. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Nam lacinia justo vel congue pretium. Fusce id mollis urna. Proin magna tortor, rhoncus at diam sed, ornare dictum urna. Vestibulum ornare porta arcu, sit amet condimentum nisl tincidunt id. Pellentesque vitae ipsum ac sapien iaculis tristique. Fusce accumsan sollicitudin ligula, sit amet eleifend ex porta et. Mauris maximus posuere est, id tempus quam facilisis quis. In scelerisque libero vel sem sagittis sodales. Curabitur rutrum id augue pretium gravida. Suspendisse potenti."
			+ "Suspendisse eget auctor elit. Sed bibendum scelerisque fermentum. Maecenas pulvinar metus ac mi finibus, vel luctus elit aliquet. Duis efficitur fermentum sem, vel fermentum ante auctor quis. In et tristique enim, vitae pulvinar risus. Sed eget augue dui. Vestibulum quis est viverra, imperdiet arcu eu, iaculis turpis. Nulla facilisi. Ut hendrerit dui in viverra fermentum."
			+ "Fusce aliquam dictum sem. Nullam vel ex sed felis iaculis dapibus. Cras est lorem, sodales et hendrerit sit amet, mollis ut nisi. Donec libero metus, consequat vitae varius vel, efficitur in magna. Mauris rhoncus nulla vel nisi placerat, quis eleifend est imperdiet. Nam vitae ultrices enim, sit amet rutrum sem. Aliquam pharetra vulputate semper. Sed scelerisque volutpat lectus, eu vestibulum leo pharetra at. Sed egestas tristique metus. Praesent volutpat nibh ut enim sollicitudin eleifend."
			+ "Nulla diam urna, luctus ac lacus at, ultrices vehicula lorem. Donec sed scelerisque magna. Aliquam ante dui, sollicitudin nec euismod a, vulputate eget neque. Pellentesque sit amet metus magna. Vivamus auctor sed ante a ullamcorper. Suspendisse non iaculis velit. Quisque ornare eros non lacus egestas tempus. Morbi consectetur urna quis sapien dapibus, nec vehicula ipsum volutpat. Nulla nec nunc in turpis condimentum sagittis in non ante."
			+ "Sedquis libero urna. Cras vitae tellus magna. Etiam accumsan at ex in dignissim. Quisque eros quam, varius a ex sed, varius vulputate magna. Nam ut enim et quam sodales convallis sit amet vitae tellus. Curabitur fringilla dapibus sapien eget finibus. Nulla ac imperdiet lorem. Nunc ac felis venenatis, pellentesque lacus et, efficitur ipsum. Vestibulum eleifend mi enim, eget placerat augue volutpat id. Aenean fringilla congue erat, et tempor magna mollis vel. Phasellus varius interdum nulla non elementum."
			+ "Phasellus congue egestas massa, non gravida risus venenatis eu. Pellentesque nisi dui, dapibus in sodales ut, faucibus et metus. In vitae quam a leo consectetur auctor et at erat. Etiam dignissim metus sit amet nibh pharetra lobortis. Quisque varius tortor a luctus scelerisque. Nunc ultrices dui arcu, ut viverra lectus tincidunt sed. In sit amet viverra orci. Donec ex nibh, rutrum quis erat non, imperdiet dictum leo. Aenean eget mi vitae libero tincidunt tincidunt ut nec massa. Suspendisse luctus turpis non nunc vehicula, in rutrum lectus malesuada. Vestibulum faucibus vitae velit vitae consectetur. Etiam urna enim, accumsan ac elit ac, imperdiet fermentum lacus. Suspendisse imperdiet risus id lectus pretium, ac dictum sem elementum. Nunc luctus felis non purus faucibus, at vulputate arcu venenatis. Etiam id rhoncus tortor. Sed volutpat, neque et aliquam efficitur, felis nunc ultrices diam, vitae iaculis nibh enim vitae nisi."
			+ "Phasellus sollicitudin cursus lorem. Integer eget magna eget massa dictum auctor. Ut ut viverra metus. Proin in consequat nibh. Nullam tempus volutpat eros ac venenatis. Etiam sit amet tortor feugiat, congue ipsum a, euismod magna. Sed elit elit, porttitor nec velit a, feugiat pharetra nibh. Donec condimentum sagittis tortor eget molestie. Proin ligula lectus, pellentesque malesuada dui vitae, scelerisque condimentum arcu."
			+ "Curabitur sollicitudin lectus enim. Aliquam non enim vel augue elementum elementum vel et metus. Vestibulum in velit vel metus lobortis dignissim ac vitae nisi. Sed fringilla neque eu lorem sollicitudin vestibulum. Nunc vitae pharetra lorem. Nunc porta ac mi ac congue. Praesent pharetra sed urna non varius. Fusce faucibus gravida mauris id gravida. Quisque id varius sapien. Proin consectetur dapibus felis, id accumsan odio interdum quis."
			+ "Duis ultricies iaculis nulla ut sodales. Morbi vel finibus odio, id molestie lacus. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Etiam nisi purus, facilisis non consectetur sit amet, fermentum ut sapien. Curabitur velit felis, posuere in nisi quis, interdum pulvinar tortor. Nullam feugiat blandit justo at tincidunt. Proin sed tempus velit. Curabitur tristique, nisl id ultrices dapibus, risus sapien sagittis turpis, non tincidunt risus magna ut enim. Donec iaculis felis sit amet iaculis lobortis."
			+ "Suspendisse ut sem sed erat commodo hendrerit luctus quis tortor. Ut interdum, sapien sit amet dictum pretium, ante dui aliquam ipsum, at ultricies purus est ut tortor. Mauris eu mattis velit. Vivamus nec faucibus eros, non gravida orci. Sed viverra augue placerat consequat rutrum. Vestibulum non luctus purus. Curabitur efficitur augue nec libero rhoncus, sit amet imperdiet est maximus. Nam aliquam ullamcorper elit, ut dapibus risus laoreet eget. Nam porta volutpat rutrum. Mauris ultrices commodo venenatis. Mauris ut bibendum velit. In sagittis eu arcu nec feugiat. Cras a pellentesque sem."
			+ "Aenean tincidunt non lectus sit amet porttitor. Vivamus elit eros, dapibus at tincidunt eget, imperdiet at neque. Sed quis lacus id tellus vestibulum cursus non luctus felis. Quisque imperdiet maximus nisi, sit amet tincidunt mauris sodales ut. Sed egestas magna at leo lobortis, non porta lorem pretium. Morbi eget lacus arcu. Vivamus scelerisque ligula vel urna imperdiet convallis eu ut leo. Donec tristique rhoncus turpis. Nunc ac convallis mi. Morbi a lectus posuere, tempus nulla nec, laoreet est. Integer facilisis nec nisi vel faucibus. Integer ac tellus ac justo bibendum faucibus mattis vitae odio. Donec vitae nulla quis sem tincidunt varius. Donec in risus purus."
			+ "Nam dapibus molestie blandit. Phasellus tincidunt, ligula a elementum finibus, enim tellus dapibus turpis, non tincidunt leo velit vitae leo. Mauris mi turpis, vehicula interdum tristique nec, porta non lectus. Morbi id laoreet dui. Vivamus eget mauris varius, placerat mauris at, maximus arcu. Ut id placerat nulla, a pellentesque dui. Phasellus quis egestas elit, et consequat erat. Suspendisse felis velit, elementum in tempor non, rutrum at lacus. Cras arcu lacus, dictum et sapien et, sollicitudin posuere nisl. Vivamus sit amet aliquet neque."
			+ "Pellentesque in condimentum neque. Fusce volutpat cursus ultrices. Ut gravida laoreet odio eget rutrum. Pellentesque pretium nulla justo. Aliquam dignissim nisl sed aliquet euismod. Etiam in nisl tincidunt, consectetur turpis id, euismod est. Aenean at cursus odio, ut aliquam tellus."
			+ "Proin turpis ligula, iaculis vitae neque eu, blandit blandit massa. Interdum et malesuada fames ac ante ipsum primis in faucibus. Sed laoreet nulla tincidunt nulla aliquam, eget ornare odio vestibulum. Vestibulum laoreet eros quis leo hendrerit consectetur. Maecenas in risus non arcu sagittis consequat. Donec ultrices, ante feugiat feugiat pellentesque, urna diam accumsan ligula, pharetra tempor ante nulla quis magna. Nullam in metus consectetur, condimentum magna sed, mollis metus.";

	@Override
	public void enter(ViewChangeEvent event) {
		removeAllComponents();
		addComponent(new Label(TEXT));
	}

	@Override
	public boolean isMenuEntryPoint() {
		return true;
	}

	@Override
	public String getName() {
		return "Bar";
	}

}
